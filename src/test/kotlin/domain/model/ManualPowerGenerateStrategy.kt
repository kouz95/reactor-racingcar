package domain.model

class ManualPowerGenerateStrategy(private val power: Power) : PowerGenerateStrategy {
    override fun generate() = power
}
