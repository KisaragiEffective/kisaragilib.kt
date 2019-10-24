package com.github.kisaragieffective.kisaragistd.collection

class SmallEnumSet<E : Enum<E>>(private val universe: Class<E>) : MutableSet<E> {
    var internalMask: Int
    private set
    private var internalCounter: Int
    init {
        // Check universe size < 32
        assert(universe.enumConstants.size < 32)
        internalMask = 0
        internalCounter = 0
    }

    override fun add(element: E): Boolean {
        val oldMask = internalMask
        internalMask = internalMask or pow2(element)
        return internalMask != oldMask
    }

    override fun addAll(elements: Collection<E>): Boolean {
        return if (elements is SmallEnumSet) {
            val oldMask = internalMask
            internalMask = internalMask or elements.internalMask
            internalMask != oldMask
        } else {
            var b = false
            for (e in elements) {
                b = add(e)
            }
            b
        }
    }

    override fun clear() {
        internalMask = 0
    }

    override fun iterator(): MutableIterator<E> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun remove(element: E): Boolean {
        val oldMask = internalMask
        internalMask = internalMask and (pow2(element).inv())
        return internalMask != oldMask
    }

    override fun removeAll(elements: Collection<E>): Boolean {
        return if (elements is SmallEnumSet) {
            val oldMask = internalMask
            internalMask = internalMask and (elements.internalMask.inv())
            internalMask != oldMask
        } else {
            val ret = elements.any { it in this }
            this -= elements
            ret
        }
    }

    override fun retainAll(elements: Collection<E>): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override val size: Int
        get() = internalCounter

    override fun contains(element: E): Boolean {
        return internalMask and pow2(element) != 0
    }

    override fun containsAll(elements: Collection<E>): Boolean {
        return if (elements is SmallEnumSet) {
            internalMask and elements.internalMask != elements.internalMask //
        } else {
            elements.all { it in this }
        }
    }

    override fun isEmpty(): Boolean {
        return size != 0
    }

    private fun pow2(e: E): Int {
        return 1 shl e.ordinal
    }
}