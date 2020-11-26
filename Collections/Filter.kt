fun main(args : Array<String>) {
    println("==============LIST=================")
    val ml = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8)
    println("1. ${ml.toString()}")

    val ml2 = ml.filter { it % 2 == 0 }     // 짝수인 원소
    if(ml2 is List<Int>) println("List")
    println("2. ${ml2.toString()}")

    val ml3 = ml.filterNot { it % 2 == 0 }    // 홀수인 원소
    println("3. ${ml3.toString()}")

    val ml4 = ml.filterIndexed { index, i ->    // index가 짝수인 원소들
        print("${index}:${i} ")
        index % 2 == 0
    }
    println()
    println("4. ${ml4.toString()}")



    println("==============MAP=================")
    val mm = mutableMapOf(1 to "avd", 3 to "zcd", 4 to "fds", 2 to "qwe")
    println("1. ${mm.toString()}")

    val mm2 = mm.filter { it.value < "m" }
    if(mm2 is Map<Int, String>) println("Map")
    println("2. ${mm2.toString()}")

    // mm2[6] = "asdf"  // Error, Map은 불변

    val mm3 = mm.filterNot { it.key < 3 }
    println("3. ${mm3.toString()}")

}