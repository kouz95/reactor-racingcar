package domain.model

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

import java.util.*

internal class GameResultTest {

    @Test
    fun record() {
        val gameResult = GameResult()
        gameResult.record(Cars(listOf(Car())))

        assertThat(gameResult.all.count()).isEqualTo(1)
    }

    @Test
    fun findWinner() {
        val winnerName = "a,b"
        val records = Stack<Pair<String, Position>>()

        val winners = winnerName.split(",")
        records.push(Pair(winners[0], Position(1)))
        records.push(Pair(winners[1], Position(1)))
        records.push(Pair("c", Position(0)))

        assertThat(GameResult(records).findWinnerName()).isEqualTo(winnerName)
    }
}