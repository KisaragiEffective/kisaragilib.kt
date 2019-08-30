package com.github.kisaragieffective.kisaragistd

interface InfinityIterator<E> : Iterator<E> {
    override fun hasNext() = true
}