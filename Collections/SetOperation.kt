fun main(args : Array<String>) {

    val ms = mutableSetOf(1, 2, 3, 4)
    val ms2 = mutableSetOf(3, 4, 5, 6)

    println("=============집 합================")
    println("ms : ${ms.toString()}")
    println("ms2 : ${ms2.toString()}")

    val plus = ms.union(ms2)
    println("합집합 : ${plus.toString()}")

    val minus = ms.subtract(ms2)
    println("차집합 : ${minus.toString()}")

    val equal = ms.intersect(ms2)
    println("교집합 : ${equal.toString()}")
}