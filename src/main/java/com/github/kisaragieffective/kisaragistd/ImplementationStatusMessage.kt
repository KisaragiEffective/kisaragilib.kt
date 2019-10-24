package com.github.kisaragieffective.kisaragistd

import java.util.logging.Logger
import kotlin.test.currentStackTrace

fun deprecated(dest: Logger) {
    dest.warning("" + currentStackTrace()[0] + " is deprecated.")
}

fun trigger(dest: Logger) {
    dest.warning("TRIGGER: " + currentStackTrace()[0])
}

@Throws(UnsupportedOperationException::class)
fun unsupported(message: String? = null): Nothing {
    throw if (message != null) {
        UnsupportedOperationException(message)
    } else {
        UnsupportedOperationException()
    }
}
