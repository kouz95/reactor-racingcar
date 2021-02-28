package domain.model

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CarTest {

    @Test
    fun move() {
        val car = Car()
        val moved = car.move(Power(4))
        val unMoved = car.move(Power(3))

        assertThat(moved.position).isEqualTo(car.position.increase())
        assertThat(unMoved.position).isEqualTo(car.position)
    }
}