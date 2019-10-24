package com.github.kisaragieffective.kisaragistd.function.result

sealed class Result<T, X : Throwable> {
    abstract operator fun invoke(): T

    companion object {
        fun <T> success(t: T): SuccessResult<T> = SuccessResult(t)
        fun <X : Throwable> failure(x: X): FailureResult<X> = FailureResult(x)
    }
}

class SuccessResult<T>(private val value: T) : Result<T, Nothing>() {
    override fun invoke(): T {
        return value
    }
}

class FailureResult<X : Throwable>(private val exception: X) : Result<Nothing, X>() {
    override fun invoke(): Nothing {
        throw exception
    }
}

fun <T, X : Throwable> Result<T, X>.unwrap(): T = this()