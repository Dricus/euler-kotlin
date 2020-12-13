package nl.dricus.euler

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Problem029Test : AbstractProblemTest<Int, Problem029>(Problem029) {
    @Test
    fun example() {
        assertEquals(15, problem.solution(2..5))
    }
}