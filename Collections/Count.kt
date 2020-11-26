fun main(args : Array<String>) {
    println("=============LIST================")
    val ml = mutableListOf("abc", "sort", "book", "book4", "roll", "book2", "book3")
    println(ml)

    val c1 = ml.count()
    println("총 개수 : $c1")

    val c2 = ml.count { it.startsWith("b") }
    println("b로 시작하는 문자열의 개수 : $c2")

    val c3 = ml.count { it.last().isDigit() }
    println("마지막이 숫자로 끝나는 문자열의 개수 : $c3")



    println("=============SET================")
    val sm = mutableSetOf(4, 3, 2, 1, 5, 6, 7)
    val rs = sm.count { it >= 5 }
    println("5이상 원소의 개수 : $rs")



    println("=============MAP================")
    val mm = mutableMapOf(1 to "abc", 2 to "bkt", 3 to "qwe", 4 to "aer")
    val ms = mm.count { it.key <= 3 && it.value <= "m" }
    println("Key는 3 이하이며, Value는 사전 순 m보다 앞에 오는 원소 개수 : $ms")
}