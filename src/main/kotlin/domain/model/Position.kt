package domain.model

data class Position(val position: Int = 0) {
    fun increase() = Position(position.inc())
}
