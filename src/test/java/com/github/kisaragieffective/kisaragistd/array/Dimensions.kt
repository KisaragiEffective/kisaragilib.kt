package com.github.kisaragieffective.kisaragistd.array

import kotlin.test.assertTrue

fun main() {
    assertTrue(arrayOf("").dimensions() == 1, "Array<str>.dim == 1")
    assertTrue(arrayOf(arrayOf("")).dimensions() == 2, "Array<Array<str>>.dim == 2")
    assertTrue(arrayOf(booleanArrayOf()).dimensions() == 2, "Array<Array<bool>>.dim == 2")

}

inline fun <E> Array<E>.dimensions(): Int {
    var o: Any? = this
    var c = 0
    while (o is Array<*>) {
        c++
        o = o[0]
    }
    println(o!!::class)
    return c + when (o) {
        is ByteArray, is ShortArray, is IntArray, is LongArray, is FloatArray, is DoubleArray, is BooleanArray -> 1
        else -> 0
    }
}