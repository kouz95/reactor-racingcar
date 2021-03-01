package domain.model

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GameTest {

    @Test
    fun run() {
        val gameResult = Game.run(Cars(listOf(Car(), Car())), TryCount(1), ManualPowerGenerateStrategy(Power(4)))

        gameResult.all.forEach { assertThat(it).isEqualTo(Pair("", Position(1))) }
    }
}