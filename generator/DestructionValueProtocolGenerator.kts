println("""interface DestructionValueProtocol""")
println()
println("""interface DestructionValueProtocol1<out E1> : DestructionValueProtocol {
    |    fun component1(): E1
    |}
""".trimMargin())
println()

for (i in 2..32) {
    println("interface DestructionValueProtocol$i<" + (1..i).joinToString { "out E$it" } + "> : DestructionValueProtocol${i - 1}<" + (1..(i-1)).joinToString { "E$it" } + "> {")
    println("    fun component$i(): E$i")
    println("}")
    println()
}
