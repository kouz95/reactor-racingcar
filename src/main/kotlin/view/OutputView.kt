package view

import domain.model.Cars

class OutputView {
    fun printResult() = println("실행 결과")

    fun printCarState(cars: Cars) {
        cars.states.forEach { println("${it.first} : ${"-".repeat(it.second.position)}") }
        println()
    }

    fun printWinner(winners: Cars) = println("${winners.names.joinToString(separator = ",")}가 최종 우승했습니다.")
}
