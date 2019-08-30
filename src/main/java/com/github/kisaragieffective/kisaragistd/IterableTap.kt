package com.github.kisaragieffective.kisaragistd

fun <E, V, K : Iterable<E>> K.tap(f: (E) -> V): K {
    this.forEach {
        f(it)
    }
    return this
}