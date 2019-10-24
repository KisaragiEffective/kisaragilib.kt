package com.github.kisaragieffective.kisaragistd.function.defensivecopy

import com.github.kisaragieffective.kisaragistd.OnlyNull
import com.github.kisaragieffective.kisaragistd.trait.InternalTrueCloneable

interface DefensiveCopier<E> {
    fun invoke(): E

    companion object {
        fun <E : InternalTrueCloneable<E>> of(original: E): DefensiveCopier<E> {
            return GeneralDefensiveCopier(original, object : (E) -> E {
                override fun invoke(p1: E): E {
                    return p1.clone()
                }
            })
        }

        fun <E> of(original: E, method: (E) -> E): DefensiveCopier<E> {
            return GeneralDefensiveCopier(original, method)
        }

        fun <E> of(original: OnlyNull, method: (E) -> E): DefensiveCopier<E> {
            throw IllegalArgumentException("parameter 'original' cannot be null")
        }
    }
}