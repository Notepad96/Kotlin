fun main(args : Array<String>) {
    println("==============LIST=================")
    val ml = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8)
    println("1. ${ml.toString()}")

    val ml2 = ml.map { it + 10 }
    if(ml2 is List<Int>) println("List")
    println("2. ${ml2.toString()}")

    val ml3 = ml.mapIndexed { index, i -> index % 2 == 0 }  // 인덱스가 짝수이면 true, 아니면 false
    println("3. ${ml3.toString()}") // boolean 타입의 리스트


    println("============================================")
    val mls = mutableListOf( "f45", "543", "dsa", "", "461")
    val mls2 = mls.map { it.toIntOrNull() }         // Int형으로 바꾸지 못한다면 Null
    val mls3 = mls.mapNotNull { it.toIntOrNull() }  // Null은 포함하지 않는다.
    println("1. ${mls2.toString()}")
    println("2. ${mls3.toString()}")



    println("==============SET=================")
    val ms = mutableSetOf(5, 2, 3, 1, 4, 6)
    println("1. ${ms.toString()}")

    val ms2 = ms.map { if(it % 2 == 0) it * it else it }    // 짝수일 경우 제곱, 아니면 그대로
    if(ms2 is List<Int>) println("List")
    println("2. ${ms2.toString()}")



    println("==============MAP=================")
    val mm = mutableMapOf(1 to "avd", 3 to "zcd", 4 to "fds", 2 to "qwe")
    println("1. ${mm.toString()}")

    val mm2 = mm.map { it.key * 10 }
    if(mm2 is List<Int>) println("List")
    println("2. ${mm2.toString()}")

    val mm3 = mm.mapKeys { "new${it.key}" }     // Key의 값들을 앞에 new가 붙는 문자열로 만든다.
    if(mm3 is Map<String, String>) println("Map<String, String>")
    println("3. ${mm3.toString()}")

    val mm4 = mm.mapValues { it.key * it.key }  // Value의 값들을 Key의 제곱의 수로 만든다.
    if(mm4 is Map<Int, Int>) println("Map<Int, Int>")
    println("4. ${mm4.toString()}")
}