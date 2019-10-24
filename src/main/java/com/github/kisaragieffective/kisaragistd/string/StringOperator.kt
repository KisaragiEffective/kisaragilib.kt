package com.github.kisaragieffective.kisaragistd.string

operator fun CharSequence.get(indices: IntRange) = this.subSequence(indices.first, indices.last)

operator fun CharSequence.get(indices: IntProgression): CharSequence {
    val s = StringBuilder((indices.last - indices.first) / indices.step + 1)
    for (i in indices) {
        s += this[i]
    }
    return s
}

operator fun StringBuilder.plusAssign(other: Char) {
    this.append(other)
}

operator fun StringBuilder.plusAssign(other: CharSequence) {
    this.append(other)
}

operator fun CharSequence.times(count: Int): CharSequence {
    if (count <= 1) {
        return this
    }
    val s = StringBuilder(this.length * count)
    for (_i in 1..count) {
        s += this
    }

    return s
}

fun CharSequence.left(i: Int): CharSequence {
    return this.subSequence(0, i)
}

fun String.left(i: Int): String {
    return this.substring(0, i)
}

fun CharSequence.right(i: Int): CharSequence {
    return this.subSequence(length - i, length)
}

fun String.right(i: Int): String {
    return this.substring(length - i, length)
}
