package com.github.kisaragieffective.kisaragistd

fun <E> newIterator(f: () -> E): InfinityIterator<E> {
    return object : InfinityIterator<E> {
        override fun next() = f()
    }
}

fun <E> newIterator(seed: E, f: (E) -> E): InfinityIterator<E> {
    return object : InfinityIterator<E> {
        var prev = seed
        override fun next(): E {
            val ret = f(prev)
            prev = ret
            return ret
        }
    }
}

