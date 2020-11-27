fun main(args: Array<String>) {
    println("=================숫자 리스트=====================")
    val ml = listOf(5, 1, 2, 3, 4)
    println("List : $ml")
    println(ml.joinToString(""))
    println(ml.joinToString("|", "<", ">"))     // 순서대로 입력하였으므로
    println(ml.joinToString( prefix = "<", separator = "|", postfix =  ">"))    // 임의 순으로 입력하려면 지정해주어야 한다.
    println(ml.joinToString("|", "<", ">", 2))     // 2개 이후 ...으로 표현



    println("================문자열 리스트=====================")
    val str = "ABcdEFgh"
    val ml2 = str.toMutableList()
    println("List : $ml2")
    println("문자열 : ${ml2.joinToString("")} ")
    println(ml2.joinToString("-"))
    println(ml2.joinToString("->", "start ", " end"))

    val li = ml2.map { it + 1 }     // 알파벳 한칸 씩 이동
    var str2 = li.joinToString("")
    println("문자열 알파벳 한칸 씩 이동 : $str2")



    // Map의 경우
    var mm = mutableMapOf(1 to "sdf", 2 to "qwe")
    mm.keys.joinToString("")
}