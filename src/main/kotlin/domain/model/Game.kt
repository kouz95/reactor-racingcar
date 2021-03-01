package domain.model

object Game {
    fun run(cars: Cars, tryCount: TryCount, powerGenerateStrategy: PowerGenerateStrategy): GameResult {
        var round = tryCount
        var carsByRound = cars
        val result = GameResult()

        while (round.remain) {
            carsByRound.tryMove(powerGenerateStrategy).apply { carsByRound = this }
            result.record(carsByRound)
            round.decrease().apply { round = this }
        }

        return result
    }
}
