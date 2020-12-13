package nl.dricus.euler

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

abstract class AbstractProblemTest<TResult, TProblem : Problem<TResult>>(
    protected val problem: TProblem,
    private val solution: TResult? = null
) {
    @Test
    fun test() {
        val actual = problem.solution()
        if (solution == null)
            println("Solution to ${problem::class.simpleName}: $actual")
        else
            assertEquals(solution, actual)
    }
}