package com.github.kisaragieffective.kisaragistd.string

import kotlin.system.measureNanoTime

fun main() {
    val count = 1000000
    val orig = measureNanoTime {
        repeat(count) {
            val tc = String.format("%,d", 123456789)
            tc + tc
        }
    }

    val comma = measureNanoTime {
        repeat(count) {
            val tc = 123456789.comma()
            tc + tc
        }
    }

    val java = measureNanoTime {
        repeat(count) {
            val tc = java.lang.String.format("%,d", 123456789)
            tc + tc
        }
    }

    println("kisaragi's impl:${String.format("% ,d", orig)}")
    println("comma          :${String.format("% ,d", comma)}")
    println("java's impl    :${String.format("% ,d", java)}")
}