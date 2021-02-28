package domain.model

import java.util.*

class GameResult(private val records: Stack<Pair<String, Position>> = Stack()) {
    val all = records.asSequence()

    fun record(cars: Cars) = cars.states.forEach { records.push(it) }

    fun findWinnerName(): String {
        val winnerPosition = records.toList()
            .maxOf { it.second.position }
        return records.filter { it.second.position == winnerPosition }
            .distinct()
            .joinToString(separator = ",") { it.first }
    }
}
