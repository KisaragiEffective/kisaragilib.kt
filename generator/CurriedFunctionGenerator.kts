(2..22).forEach { sr ->
    val genericParameter = (1..sr).map {"T$it"}.joinToString()
    val curriedFunctionSigniture = ((1..sr).map {"(T$it)"} + listOf("Q")).joinToString(" -> ")
    val bodyLeft = (1..sr).withIndex().map { "       " + "    ".repeat(it.index) + "{ t${it.value} ->\n" }.joinToString("")
    val ret = "       " + "    ".repeat(sr) + "this@currying(" + (1..sr).map {"t$it"}.joinToString(", ") + ")\n"
    val bodyRight = ((0..(sr - 1)).reversed().map { "       " + "    ".repeat(it) + "}" }).joinToString("\n")
    val body = bodyLeft + ret + bodyRight
    println("""
        |@AutoGenerated("CurriedFunctionGenerator.kts")
        |fun <$genericParameter, Q> (($genericParameter) -> Q).currying(): $curriedFunctionSigniture {
        |return ${body.trimStart()}
        |}
    """.trimMargin())
}