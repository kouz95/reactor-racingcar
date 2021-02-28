package view

import reactor.core.publisher.Mono
import java.util.*

class InputView(private val scanner: Scanner) {
    fun inputCarNames(): Mono<String> {
        println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)")
        return Mono.just(scanner.nextLine())
    }

    fun inputTryCount(): Mono<String> {
        println("시도할 회수는 몇회인가요?")
        return Mono.just(scanner.nextLine())
    }

}
