package domain.model

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CarsTest {

    @Test
    fun findWinner() {
        val winner = "a"
        val cars = Cars(listOf(Car(winner).move(Power(4)), Car("b")))

        assertThat(cars.findWinner().names).isEqualTo(listOf(winner))
    }

    @Test
    fun tryMove() {
        val alwaysMoveStrategy = ManualPowerGenerateStrategy(Power(4))

        val cars = Cars(listOf(Car(), Car()))

        assertThat(cars.tryMove(alwaysMoveStrategy).states.map { it.second })
            .isEqualTo(listOf(Position(1), Position(1)))
    }

    @Test
    fun from() {
        assertThat(Cars.from("a,b").names).isEqualTo(listOf("a", "b"))
    }
}