package nl.dricus.euler

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Problem026Test : AbstractProblemTest<Pair<Int, Int>, Problem026>(Problem026, 983 to 982) {
    @Test
    fun example() {
        assertEquals(7 to 6, problem.solution(1..10))
    }
}