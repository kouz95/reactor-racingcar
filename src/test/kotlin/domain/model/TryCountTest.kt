package domain.model

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TryCountTest {

    @Test
    fun getRemain() {
        assertThat(TryCount(1).remain).isTrue
        assertThat(TryCount().remain).isFalse
    }

    @Test
    fun decrease() {
        assertThat(TryCount(1).decrease()).isEqualTo(TryCount())
    }
}