package domain.model

object Game {
    fun run(cars: Cars, tryCount: TryCount, powerGenerateStrategy: PowerGenerateStrategy): GameResult {
        var round = tryCount
        var carsInRound = cars
        val result = GameResult()

        while (round.remain) {
            carsInRound.tryMove(powerGenerateStrategy).apply { carsInRound = this }
            result.record(carsInRound)
            round.decrease().apply { round = this }
        }

        return result
    }
}
