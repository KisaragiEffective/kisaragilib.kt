package com.github.kisaragieffective.kisaragistd.function

import kotlin.test.assertTrue

fun main() {
    assertTrue {
        ({ _: Unit, _: Unit -> 2}.currying())(Unit)(Unit) == 2
    }

    assertTrue {
        ({ a: Int, b: Int -> a + b}.currying())(3)(5) == 8
    }

    assertTrue {
        ({ a: Int, b: Int, c: Int, d: Int, e: Int, f: Int, g: Int, h: Int, i: Int -> a + b + c + d + e + f + g + h + i}.currying())(1)(2)(3)(4)(5)(6)(7)(8)(9) == 45
    }
}
