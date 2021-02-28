package view

import domain.model.GameResult

object OutputView {
    fun printResult(result: GameResult) {
        println("실행 결과")

        result.all.forEachIndexed { index, record ->
            run {
                val carCount = result.all
                    .map { it.first }
                    .distinct()
                    .count()

                if (index % carCount == 0) {
                    println()
                }
                println("${record.first} : ${"-".repeat(record.second.position)}")
            }
        }
        println("${result.findWinnerName()}가 최종 우승했습니다.")
    }
}
