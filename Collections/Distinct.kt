fun main(args : Array<String>) {
    val ml = mutableListOf(1, 3, 2, 4, 5)
    ml.addAll(listOf(3, 2, 3, 1, 4, 5, 6))

    println("==================Distinct===================")
    println("before : $ml")
    val ml2 = ml.distinct()
    println("after : $ml2")

    println("==================Distinct2==================")
    val list = listOf('a', 'A', 'b', 'B', 'A', 'a')
    println(list)
    val list2 = list.distinct()
    println(list2)

}