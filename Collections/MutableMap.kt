fun main(args : Array<String>) {

    // val mm = mutableMapOf<Int, String>()
    val mm = mutableMapOf(1 to "z", 2 to "y", Pair(3, "x"))

    println("=============M A P================")
    println(mm)



    println("=============삽 입================")
    mm[5] = "v"
    mm.put(4, "w")
    mm[1] = "x"

    for(i in mm) {
        // if(i is MutableMap.MutableEntry<Int, String>)    // i의 타입
        print("${i.key}:${i.value} ")
    }
    println()



    println("=============삭 제================")
    println(mm.remove(5))   // key 5인 쌍 삭제하며 value 값 반환
    println(mm.remove(4, "w"))  // key=4, value="w" 이 존재하면 삭제, 성공하면 true 아니면 false

    for((k, v) in mm) {
        print("${k}:${v} ")
    }
    println()



    println("=============프로퍼티================")
    println("Size = ${mm.size}")
    println(mm.entries) // 키 + 값 MutableMap.MutableEntry<Int, String>
    println(mm.keys)    // 키들만  MutableSet<K>
    println(mm.values)  // 값들만  MutableCollection<V>



    println("=============정 렬================")
    //val mm2 = mm.toSortedMap(compareBy {it} )   // Key 오름차순
    val mm2 = mm.toSortedMap(compareByDescending {it} )   // Key 내림차순
    mm2.forEach{ (k, v) -> print("${k}:${v} ") }
    println()

}