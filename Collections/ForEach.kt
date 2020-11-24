fun main(args : Array<String>) {
    val ml = mutableListOf(1, 2, 3, 4, 5)

    // 리스트 출력
    print("1. ")
    println(ml)

    // 각 원소 for문
    print("2. ")
    for(a in ml) {
        print("$a ")
    }
    println()

    // index로 for문
    print("3. ")
    for(i in 0..ml.lastIndex) {
        print("${i}:${ml[i]} ")
    }
    println()

    // index로 for문
    print("4. ")
    for(i in ml.indices) {
        print("${i}:${ml[i]} ")
    }
    println()


    // forEach
    print("5. ")
    ml.forEach { print("$it ") }
    println()


    // forEach + index
    print("6. ")
    ml.forEachIndexed{ index, value ->
        print("${index}:${value} ")
    }
    println()

}