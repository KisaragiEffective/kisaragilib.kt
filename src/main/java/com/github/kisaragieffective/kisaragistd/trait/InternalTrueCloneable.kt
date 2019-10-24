package com.github.kisaragieffective.kisaragistd.trait

internal interface InternalTrueCloneable<out E : Any> : TrueCloneable<E> {
    public override fun clone(): E
}