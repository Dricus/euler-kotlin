package nl.dricus.euler.math

fun properDivisors(i: Int) =
    (1..i / 2).filter {
        i % it == 0
    }.toSet()
