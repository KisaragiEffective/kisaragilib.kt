package com.github.kisaragieffective.kisaragistd.function

class ConstFunction0<E>(val e: E) : () -> E {
    override fun invoke() = e
}
