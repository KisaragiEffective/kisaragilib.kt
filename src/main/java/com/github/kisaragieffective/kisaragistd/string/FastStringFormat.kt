package com.github.kisaragieffective.kisaragistd.string

import com.github.kisaragieffective.kisaragistd.i32
import com.github.kisaragieffective.kisaragistd.i64
import java.text.NumberFormat.getNumberInstance

private typealias FormatSyntax = String

fun String.Companion.format(fs: FormatSyntax, arg: i32): String {
    if (fs == "%,d") {
        return arg.comma()
    }

    // fallback original
    return String.format(fs, arrayOf(arg))
}

fun i32.comma(): String {
    return getNumberInstance().format(toLong())
}

fun i64.comma(): String {
    return getNumberInstance().format(this)
}


