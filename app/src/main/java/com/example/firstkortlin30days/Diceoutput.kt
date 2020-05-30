package com.example.firstkortlin30days

import kotlin.random.Random

fun RollDice(): Int {
    return rand(1,6)
}

fun rand(start: Int, end: Int): Int {
    require(!(start > end || end - start + 1 > Int.MAX_VALUE)) { "Illegal Argument" }
    return Random(System.nanoTime()).nextInt(end - start + 1) + start
}