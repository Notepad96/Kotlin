fun main(args : Array<String>) {
    println("=============LIST================")
    val ml = mutableListOf("abc", "sort", "book", "book4", "roll", "book2", "book3")
    println(ml)

    val res = ml.find { it.startsWith("bo") }
    println("bo로 시작하는 문자열?(앞부터 검색) $res")

    val res2 = ml.findLast { it.startsWith("bo") }
    println("bo로 시작하는 문자열?(뒤부터 검색) $res2")

    val res3 = ml.find { it.contains("ol") }
    println("ol을 포함하는 문자열? $res3")

    val res4 = ml.find { it.endsWith("lz")}
    println("lz로 끝나는 문자열? $res4")



    println("=============SET================")
    val sm = mutableSetOf(4, 3, 2, 1, 5, 6, 7)
    val rs = sm.find { it == 7 }
    println(rs)
    val rs2 = sm.find { it == 10 }
    println(rs2)    // 존재 않으므로 null
}