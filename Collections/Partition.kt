fun main(args: Array<String>) {
    println("===================LIST=======================")
    val ml = mutableListOf(5, 4, 1, 2, 3, 6, 9, 7, 8)
    println("1. List : $ml")

    val ml2 = ml.partition { it % 2 == 0 }  // 조건에 따라서 나눈다
    if(ml2 is Pair<List<Int>, List<Int>> )
    println("2. List : $ml2")
    println("2-1. First : ${ml2.first}")    // 조건에 true면 first
    println("2-2. Second : ${ml2.second}")  // 조건에 false면 second



    println("===================SET=======================")
    val ms = mutableSetOf(5, 2, 1, 3, 4, 6)
    var ms2 = ms.partition { it > 3 }
    println("1. Set : $ms")
    println("2. Set : $ms2")
    println("2-1. First : ${ms2.first}")
    println("2-2. Second : ${ms2.second}")
}