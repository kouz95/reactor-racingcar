package domain.model

import view.OutputView

class Game(private val cars: Cars, private val tryCount: TryCount, private val outputView: OutputView) {
    fun run() {
        var tryCount = this.tryCount
        var cars = this.cars

        outputView.run {

            printResult()
            val powerGenerateStrategy = RandomPowerGenerateStrategy()

            while (tryCount.remain) {
                cars.tryMove(powerGenerateStrategy).apply { cars = this }
                printCarState(cars)
                tryCount.decrease().apply { tryCount = this }
            }

            printWinner(cars.findWinner())
        }
    }
}
