fun main(args: Array<String>) {
    println("===================LIST=======================")
    val ml = mutableListOf(5, 4, 1, 2, 3, 6)
    println("1. List : $ml")

    val ml2 = ml.flatMap { if(it % 2 == 0) listOf(it, it*it) else listOf(it) }  // 짝수라면 그 뒤에 제곱의 수를 넣는다.
    println("2. List : $ml2")


    val ml3 = ml.flatMap { if(it % 2 == 1) listOf(it, it*it, it*it*it) else listOf(it) }
    println("3. List : $ml3")



    println("===================SET=======================")
    val ms = mutableSetOf("123", "234", "345", "567")
    println("1. Set : $ms")
    val ms2 = ms.flatMap { it.toList() }.toSet()    // 문자열을 List로 만듬으로써 각 문자로 나눈다.
    println("2. Set : $ms2")

    val temp = ms.map { it.toList() }.toSet()
    println("0. Temp : $temp")


    println("===================MAP=======================")
    val mm  = mutableMapOf(1 to "eqr", 2 to "dfg", 3 to "qwe", 4 to "xzc")
    println("1. Map : $mm ")
    val mm2 = mm.flatMap { if(it.key > 2) it.value.toList() else listOf() }
    println("2. Map->List : $mm2")

}

