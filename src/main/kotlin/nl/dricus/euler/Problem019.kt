package nl.dricus.euler

object Problem019 : Problem<Int> {
    class Day(val year: Int, val month: Int, val dayOfMonth: Int, val dayOfWeek: Int)

    override fun solution() = calendar().count { it.year >= 1901 && it.dayOfMonth == 0 && it.dayOfWeek == 0 }

    private fun calendar() = generateSequence(Day(1900, 0, 0, 1)) {
        val dayOfWeek = (it.dayOfWeek + 1) % 7
        val dayOfMonth = when (it.month) {
            in listOf(3, 5, 8, 10) -> (it.dayOfMonth + 1) % 30
            1 -> {
                if (it.year % 4 == 0 && (it.year % 100 != 0 || it.year % 400 == 0))
                    (it.dayOfMonth + 1) % 29
                else
                    (it.dayOfMonth + 1) % 28
            }
            else -> (it.dayOfMonth + 1) % 31
        }
        val month = if (dayOfMonth == 0) (it.month + 1) % 12 else it.month
        val year = if (month == 0 && dayOfMonth == 0) it.year + 1 else it.year

        if (year <= 2000)
            Day(year, month, dayOfMonth, dayOfWeek)
        else
            null
    }
}
