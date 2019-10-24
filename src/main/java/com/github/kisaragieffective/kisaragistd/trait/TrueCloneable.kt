package com.github.kisaragieffective.kisaragistd.trait

interface TrueCloneable<out E : Any> : Cloneable {
    override fun clone(): E
}