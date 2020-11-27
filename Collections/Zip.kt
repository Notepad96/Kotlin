fun main(args: Array<String>) {
    println("===================LIST=======================")
    val ml = mutableListOf(5, 4, 1, 2, 3, 6)
    val ml2 = mutableListOf("a", "c", "b", "e", "d", "f")
    println("1. List : $ml")
    println("2. List : $ml2")
    val ml3 = ml.zip(ml2) {a, b -> b+a}
    println("3. List : $ml3")

    val ml4 = ml zip ml2
    if(ml4 is List<Pair<Int, String>>) println("타입 체크")
    ml4.forEach { print("${it.first}:${it.second} ") }
    println()

m

    println("===================SET=======================")
    val ms = mutableSetOf(2, 4, 3)
    println("1. Set : $ms")

    val ms2 = ms.zip(ml) { a, b -> a+b}
    // val ms2 = ml.zip(ms) { a, b -> a+b}  // 동일한 결과
    println("2. List : $ms2")
}