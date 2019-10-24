//package com.github.kisaragieffective.kisaragistd.metaprogramming
import com.github.kisaragieffective.kisaragistd.metaprogramming.isArray
import com.github.kisaragieffective.kisaragistd.metaprogramming.isEnum
import com.github.kisaragieffective.kisaragistd.metaprogramming.isFinal
import com.github.kisaragieffective.kisaragistd.metaprogramming.isFunctionalInterface
import com.github.kisaragieffective.kisaragistd.metaprogramming.isSameErasure
import kotlin.test.assertFalse
import kotlin.test.assertTrue

fun main() {
    assertTrue {
        isSameErasure<() -> Int, () -> Long>()
    }

    assertFalse {
        isSameErasure<Array<Unit>, Array<Any>>()
    }

    assertTrue {
        isArray<Array<Unit>>()
    }

    assertTrue {
        isArray<IntArray>()
    }

    assertTrue {
        isEnum<SomeEnum>()
    }

    assertTrue {
        isFinal<Unit>()
    }

    assertTrue {
        isFunctionalInterface<() -> Unit>()
    }
}

enum class SomeEnum