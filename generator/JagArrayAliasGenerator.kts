for (i in 2..32) {
    println("typealias JagArray${i}D<E> = " + "Array<".repeat(i) + "E" + ">".repeat(i))
}