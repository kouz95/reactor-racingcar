package domain.model

class Cars(private val cars: List<Car>) {
    val names = cars.map { it.name }
    val states = cars.map { Pair(it.name, it.position) }

    fun tryMove(powerGenerateStrategy: PowerGenerateStrategy) =
        Cars(cars.map { it.move(powerGenerateStrategy.generate()) })

    fun findWinner(): Cars {
        val winnerPosition = cars.maxOf { it.position.position }
        return Cars(cars.filter { it.position.position == winnerPosition })
    }

    companion object {
        private const val DELIMITER = ","

        fun from(carNames: String): Cars = Cars(carNames.split(DELIMITER).map { Car(it) })
    }
}
