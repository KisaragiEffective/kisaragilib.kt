package com.github.kisaragieffective.kisaragistd.metaprogramming

import java.lang.reflect.Modifier

inline fun <reified T, reified Q> isSameErasure(): Boolean {
    return T::class.java == Q::class.java
}

inline fun <reified T> isVoid(): Boolean {
    return T::class.java == Void.TYPE
}

inline fun <reified T> isNull(): Boolean {
    return when(T::class.java) {
        Nothing::class.java -> true
        else -> false
    }
}

inline fun <reified T> isIntegral(): Boolean {
    return when(T::class.java) {
        0.toByte().javaClass, 0.toShort().javaClass, 0.javaClass, 0.toLong().javaClass -> true
        else -> false
    }
}

inline fun <reified T> isFloatingPoint(): Boolean {
    return when(T::class.java) {
        0.0f.javaClass, 0.0.javaClass -> true
        else -> false
    }
}

inline fun <reified T> isArray(): Boolean {
    return T::class.java.isArray
}

inline fun <reified T> isEnum(): Boolean {
    return T::class.java.isEnum
}

inline fun <reified T> isInterface(): Boolean {
    return T::class.java.isInterface
}

inline fun <reified T> isFinal(): Boolean {
    return (T::class.java.modifiers and Modifier.FINAL) != 0
}

inline fun <reified T> isFunctionalInterface(): Boolean {
    return isFunction<T>() || (T::class.java.declaredMethods.size == 1 && T::class.java.declaredMethods[0].modifiers and Modifier.ABSTRACT != 0)
}

inline fun <reified T> isFunction(): Boolean {
    return T::class.java.enclosingMethod != null
}

