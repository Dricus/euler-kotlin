package nl.dricus.euler

object Problem026 : Problem<Pair<Int, Int>> {
    override fun solution() = solution(1..999)

    fun solution(range: IntRange) =
        reciprocalFractions(range).maxByOrNull { (_, fraction) -> fraction }!!

    private fun reciprocalFractions(range: IntRange) =
        range.map { it to reciprocalFractionLength(it) }

    private fun reciprocalFractionLength(divisor: Int): Int {
        tailrec fun find(remainder: Int, position: Int, seen: Map<Int, Int>): Int {
            if (remainder == 0) return 0

            val newRemainder = (remainder % divisor) * 10

            return seen[newRemainder]?.let { position - it }
                ?: find(newRemainder, position + 1, seen + (newRemainder to position))
        }

        return find(1, 0, emptyMap())
    }
}