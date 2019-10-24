package com.github.kisaragieffective.kisaragistd.collection.iterator

interface InfinityIterator<E> : Iterator<E> {
    override fun hasNext() = true
}