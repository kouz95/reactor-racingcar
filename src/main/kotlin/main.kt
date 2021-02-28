import domain.model.Cars
import domain.model.TryCount
import view.InputView
import view.OutputView

fun main() {
    InputView.run {
        inputCarNames()
            .flatMap { carNames ->
                inputTryCount()
                    .map { Game.run(Cars.from(carNames), TryCount(it.toInt())) }
            }
            .subscribe { OutputView.printResult(it) }
    }
}