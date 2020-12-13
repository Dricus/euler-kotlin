package nl.dricus.euler

import nl.dricus.euler.math.abuntantNumbers

object Problem023 : Problem<Int> {
    override fun solution() = solution(1..28123)

    fun solution(range: IntRange): Int {
        val abundants = abuntantNumbers(range.last)

        return range
            .filter { candidate ->
                abundants.none { a ->
                    candidate - a in abundants
                }
            }
            .sum()
    }
}