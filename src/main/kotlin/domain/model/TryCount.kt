package domain.model

data class TryCount(private val tryCount: Int = 0) {
    val remain = tryCount > NO_COUNT

    fun decrease() = TryCount(tryCount.dec())

    companion object {
        private const val NO_COUNT = 0
    }
}
