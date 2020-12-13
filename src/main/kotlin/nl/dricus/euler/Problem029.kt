package nl.dricus.euler

import kotlin.math.pow

object Problem029 : Problem<Int> {
    override fun solution() = solution(2..100)

    fun solution(range: IntRange): Int {
        return range.flatMap { num -> range.map { power -> num.toDouble() to power.toDouble() } }
            .fold(emptySet<Double>()) { acc, (num, power) ->
                acc + num.pow(power)
            }
            .size
    }
}