package domain.model

class Cars(private val cars: List<Car>) {
    val names = cars.map { it.name }
    val states = cars.map { Pair(it.name, it.position) }

    fun tryMove(powerGenerateStrategy: PowerGenerateStrategy) =
        Cars(cars.map { it.move(powerGenerateStrategy.generate()) })

    companion object {
        private const val DELIMITER = ","

        fun from(carNames: String): Cars = Cars(carNames.split(DELIMITER).map { Car(it) })
    }
}
