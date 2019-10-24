package com.github.kisaragieffective.kisaragistd.function.defensivecopy

class GeneralDefensiveCopier<E>(private val original: E, private val function: (E) -> E) : DefensiveCopier<E> {
    override fun invoke(): E {
        return function(original)
    }
}