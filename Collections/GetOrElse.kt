fun main(args : Array<String>) {
    println("=============LIST================")
    val ml = mutableListOf(4, 1, 2, 5, 3)
    println(ml)
    // println(ml[10])  // IndexOutOfBoundException
    println("1. ${ml.getOrNull(4) }")   // index = 4는 존재하므로 ml[4]를 반환
    println("2. ${ml.getOrNull(10) }")  // index = 10는 없으므로 Null 반환
    println("3. ${ml.getOrElse(10) { -1 } }")   // index = 10은 없으므로 대신 -1 반환



    println("==============MAP===============")
    val mm = mutableMapOf(3 to "qwe", 1 to "asd", 2 to "grf", 4 to "zxc")
    println(mm)
    println("1. ${mm.getOrDefault(1, -1)}") // Key = 1은 존재하므로 Value 가져온다.
    println("2. ${mm.getOrDefault(10, -1)}") // Key = 10은 존재않으므로 -1 반환
    println("3. ${mm.getOrElse(10) { -1 } } ")  // getOrDefault와 동일한 기능
    println(mm[10])

    println("4. ${mm.getOrPut(10) { "PLUS" } } ") // Key = 10은 존재않으므로 10=PLUS 삽입
    println(mm[10]) // getOrPut을 사용하여 삽입되었다.
}