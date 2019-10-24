package com.github.kisaragieffective.kisaragistd.array

import com.github.kisaragieffective.kisaragistd.function.result.Result
import kotlin.test.assertTrue

fun ok(): Result<String, Nothing> {
    return Result.success("OK")
}

fun ng(): Result<Nothing, Exception> {
    return Result.failure(Exception())
}

fun main() {
    assertTrue(ok()() == "OK")
    assertTrue {
        @Suppress("IMPLICIT_NOTHING_AS_TYPE_PARAMETER", "UNREACHABLE_CODE")
        try {
            ng()()
            false
        } catch (e: Exception) {
            true
        }
    }
}