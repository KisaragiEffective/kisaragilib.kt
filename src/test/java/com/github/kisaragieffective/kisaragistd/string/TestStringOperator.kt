package com.github.kisaragieffective.kisaragistd.string

import kotlin.test.assertFalse
import kotlin.test.assertTrue

fun main() {
    assertTrue {
        "12345".left(3) == "123"
    }

    assertFalse {
        "12345".left(3) == "234" &&
        "12345".left(3) == "345"
    }

    val left3 = { it: String ->
        it.right(3)
    }

    assertTrue {
        println(left3("12345"))
        left3("12345") == "345"
    }
}