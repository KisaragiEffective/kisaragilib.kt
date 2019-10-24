package com.github.kisaragieffective.kisaragistd.collection.iterator

inline fun <E> newIterator(crossinline f: () -> E): InfinityIterator<E> {
    return object : InfinityIterator<E> {
        override fun next() = f()
    }
}

inline fun <E> newIterator(seed: E, crossinline f: (E) -> E): InfinityIterator<E> {
    return object : InfinityIterator<E> {
        var prev = seed
        override fun next(): E {
            val ret = f(prev)
            prev = ret
            return ret
        }
    }
}
