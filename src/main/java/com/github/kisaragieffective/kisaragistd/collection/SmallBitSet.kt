package com.github.kisaragieffective.kisaragistd.collection

import com.github.kisaragieffective.kisaragistd.OnlyNull
import java.util.BitSet

class SmallBitSet : BitSet() {
    val internalMask = 0
    override fun get(bitIndex: Int): Boolean {
        return internalMask and value(bitIndex) != 0
    }

    override fun toByteArray(): ByteArray {
        return byteArrayOf(
                ((internalMask and 0xFF000000.toInt())   shr 24).toByte(),
                ((internalMask and 0x00FF0000)           shr 16).toByte(),
                ((internalMask and 0x0000FF00)           shr 8 ).toByte(),
                ((internalMask and 0x000000FF)                 ).toByte()
                )
    }

    override fun toLongArray(): LongArray {
        return longArrayOf(internalMask.toLong())
    }

    private fun value(i: Int): Int {
        return 1 shl i
    }

    override fun equals(other: Any?): Boolean {
        return when (other) {
            is SmallBitSet -> equals(other)
            is OnlyNull -> equals(other)
            else -> false
        }
    }

    fun equals(other: SmallBitSet): Boolean {
        return (this as BitSet) == (other as BitSet)
    }

    fun equals(other: OnlyNull) = false
    override fun hashCode(): Int {
        var result = super.hashCode()
        result = 31 * result + internalMask
        return result
    }
}