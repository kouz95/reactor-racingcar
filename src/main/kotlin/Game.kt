import domain.model.Cars
import domain.model.GameResult
import domain.model.RandomPowerGenerateStrategy
import domain.model.TryCount

object Game {
    fun run(cars: Cars, tryCount: TryCount): GameResult {
        var round = tryCount
        var carsInRound = cars
        val result = GameResult()

        while (round.remain) {
            // TODO: 2021/03/01 test Game 
            carsInRound.tryMove(RandomPowerGenerateStrategy).apply { carsInRound = this }
            result.record(carsInRound)
            round.decrease().apply { round = this }
        }

        return result
    }
}
