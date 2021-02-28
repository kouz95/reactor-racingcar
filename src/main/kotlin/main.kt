import domain.model.Cars
import domain.model.Game
import domain.model.TryCount
import view.InputView
import view.OutputView
import java.util.*

fun main() {
    val inputView = InputView(Scanner(System.`in`))

    inputView.run {
        inputCarNames()
            .flatMap { carNames ->
                inputTryCount()
                    .map { Game(Cars.from(carNames), TryCount(it.toInt()), OutputView()) }
            }
            .subscribe { it.run() }
    }
}