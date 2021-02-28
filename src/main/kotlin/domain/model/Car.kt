package domain.model

class Car(val name: String = "", val position: Position = Position()) {
    fun move(power: Power) = when {
        power.enough -> Car(name, position.increase())
        else -> Car(name, position)
    }
}
