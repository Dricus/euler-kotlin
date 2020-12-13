package nl.dricus.euler.math

fun abuntantNumbers(max: Int): Set<Int> =
    (0..max).filter { isAbundant(it) }.toSet()

fun isAbundant(i: Int) =
    properDivisors(i).sum() > i
