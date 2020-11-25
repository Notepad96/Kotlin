fun main(args : Array<String>) {

    val mm = mutableMapOf(1 to "za", 3 to "yd", 2 to "zzz", 4 to "aa")

    println("=============M A P================")
    println(mm)



    println("=============toList================")
    val tl = mm.toList()
    for(i in tl) {
        if(i is Pair<Int, String>) {
            println("타입 검사=${i.first}:${i.second}")
        }
    }



    println("=============정 렬================")
    val tl2 = tl.sortedBy { it.second }   // Value 오름차순
    //val tl2 = tl.sortedByDescending { it.second }   // Value 내림차순
    println(tl2)



    println("=============toMutableMap================")
    val mm2 = tl2.toMap().toMutableMap()
    mm2.forEach { (k, v) -> print("${k}:${v} ") }
    println()



    println("=============한 줄로 작성================")
    val mm3 = mm.toList().sortedByDescending { it.second }.toMap().toMutableMap()
    mm3.forEach { (k, v) -> print("${k}:${v} ") }
    println()
}