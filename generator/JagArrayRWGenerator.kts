for (i in 2..32) {
    println("import com.github.kisaragieffective.kisaragistd.JagArray${i}D")
}
for (i in 2..32) {
    println("operator fun <E> JagArray${i}D<E>.get(" + (1..i).joinToString { "i$it: Int" } + ") = " + (1..i).joinToString{ "[i$it]" })
}