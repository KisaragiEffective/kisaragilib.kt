package com.github.kisaragieffective.kisaragistd

fun <E> Array<E>.addOut(): Array<out E> = this

inline fun <reified E> Array<out E>.removeOut(): Array<E> = this.map { it }.toTypedArray()