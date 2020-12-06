fun main(args: Array<String>) {
    println("==================1========================")
    val ml = mutableListOf(5, 4, 1, 2, 3, 6)
    println(ml)
    ml.sort()   // 오름차순 정렬
    println(ml)



    println("===================2=======================")
    val ml2 = ml.sorted().toMutableList()   // 오름차순으로 정렬된 List 반환
    println(ml2)
    ml2.sortDescending()    // 내림차순으로 정렬
    println(ml2)




    println("====================3======================")
    val ml3 = mutableListOf(2 to "abc", 4 to "abc", 3 to "qwe", 1 to "zwr")
    println(ml3)
    ml3.sortByDescending { it.second }  // second를 기준으로 내림차순
    println(ml3)



    println("====================4======================")
    val ml4 = ml3.sortedWith( compareBy( {it.second}, {-it.first}) )    // 우선 second 기준으로 오름차순, 만약 second가 동일하다면 first로 내림차순
    println(ml4)


    println("====================5======================")
    val ml5 = mutableListOf("1", "32", "23", "4", "5")
    val ml6 = ml5.sortedWith( Comparator { a, b ->  (b+a).compareTo(a+b) })
    println(ml5)
    println(ml6)

    val ml7 = mutableListOf(2, 5, 3, 1, 4)
    val ml8 = ml7.sortedWith( Comparator { a, b -> b - a })
    println(ml7)
    println(ml8)
}