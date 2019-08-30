package com.github.kisaragieffective.kisaragistd

inline fun <reified E> Any?.autoType() = this as E

inline fun <reified E> Any?.autoType(default: E) = this as? E ?: default
