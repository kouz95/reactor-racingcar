package domain.model

import java.util.*

object RandomPowerGenerateStrategy : PowerGenerateStrategy {
    private const val MAX_POWER_BOUND = 10

    override fun generate() = Power(Random().nextInt(MAX_POWER_BOUND))
}
