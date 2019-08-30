package com.github.kisaragieffective.kisaragistd

fun BooleanArray.boxed() = this.map { it }.toTypedArray()

fun ByteArray.boxed() = this.map { it }.toTypedArray()

fun ShortArray.boxed() = this.map { it }.toTypedArray()

fun IntArray.boxed() = this.map { it }.toTypedArray()

fun LongArray.boxed() = this.map { it }.toTypedArray()

fun FloatArray.boxed() = this.map { it }.toTypedArray()

fun DoubleArray.boxed() = this.map { it }.toTypedArray()

fun Array<Boolean>.unboxed() = BooleanArray(this.size) { this[it] }

fun Array<Byte>.unboxed() = ByteArray(this.size) { this[it] }

fun Array<Short>.unboxed() = ShortArray(this.size) { this[it] }

fun Array<Int>.unboxed() = IntArray(this.size) { this[it] }

fun Array<Long>.unboxed() = LongArray(this.size) { this[it] }

fun Array<Float>.unboxed() = FloatArray(this.size) { this[it] }

fun Array<Double>.unboxed() = DoubleArray(this.size) { this[it] }
