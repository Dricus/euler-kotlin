package nl.dricus.euler

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Problem023Test : AbstractProblemTest<Int, Problem023>(Problem023, 4179871) {
    @Test
    fun example() {
        assertEquals((1..23).sum(), problem.solution(1..24))
    }
}