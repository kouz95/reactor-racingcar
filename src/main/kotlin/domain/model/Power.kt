package domain.model

data class Power(private val power: Int) {
    val enough = power >= ENOUGH_POWER

    companion object {
        private const val ENOUGH_POWER = 4
    }
}
