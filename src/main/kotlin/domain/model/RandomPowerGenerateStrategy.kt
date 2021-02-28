package domain.model

import java.util.*

class RandomPowerGenerateStrategy : PowerGenerateStrategy {
    override fun generate() = Power(Random().nextInt(MAX_POWER_BOUND))

    companion object {
        private const val MAX_POWER_BOUND = 10
    }
}
