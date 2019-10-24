
for (i in 0..31) {
    val actualDim = i + 1
    val type = "Array<".repeat(actualDim) + "E" + ">".repeat(actualDim)
    println("fun <E> $type.dimensions() = $actualDim")
    println("fun <E> $type.dimension() = $actualDim")
    println("fun <E> $type.dim() = $actualDim")
    println()

    for (t in arrayOf("BooleanArray", "ByteArray", "ShortArray", "IntArray", "LongArray", "FloatArray", "DoubleArray")) {
        val type = "Array<".repeat(i) + t + ">".repeat(i)
        println("fun $type.dimensions() = $actualDim")
        println("fun $type.dimension() = $actualDim")
        println("fun $type.dim() = $actualDim")
        println()
    }
    println()
    println()
}
print("// ")
