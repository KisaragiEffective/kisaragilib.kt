package com.github.kisaragieffective.kisaragistd.function.defensivecopy

import com.github.kisaragieffective.kisaragistd.trait.InternalTrueCloneable

internal class DefensiveCopierImplForCloneable<E : InternalTrueCloneable<E>>(private val original: E) : DefensiveCopier<E> {
    override fun invoke(): E {
        return original.clone()
    }
}