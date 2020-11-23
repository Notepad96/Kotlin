fun main(args : Array<String>) {

    //val ml = MutableList(5, {0})    // size = 5, 0으로 초기화
    val ml = mutableListOf(1, 2, 3, 3, 4)

    println("\n===============MutableList====================")
    println(ml)


    println("\n=================삽 입================")
    ml.add(5)   // 맨 뒤에 5 삽입
    ml += 6     // plusAssign
    ml.add(0, 7)    // index = 0에 7 삽입
    ml.addAll(Array(3, {8} ))   // size = 3만큼 8 삽입

    for(i in ml.indices) {  // index를 사용하여서 루프
        print("${ml[i]} ")
    }
    println()



    println("\n================삭 제=================")
    if(ml.remove(1)) println("1 삭제 성공!") else println("1 삭제 실패!")
    ml.removeAt(0)  // index = 0 요소 삭제
    ml.removeAll(arrayOf(2, 3))
    println(ml)



    println("\n================프로퍼티=================")
    println("길이 : ${ml.size}")
    println("인덱스 Range : ${ml.indices}")
    println("마지막 index : ${ml.lastIndex}")



    println("\n================복사 및 컨버트=================")
    val ml2 = ml.toMutableList()    // 복사
    if(ml2 !== ml) println("동일하지 않습니다.")

    val ml3 = ml.subList(0, 2)  // 리스트 자르기, index [0 ~ 2)
    println(ml3)


    ml.clear()
    if(ml.isEmpty()) println("리스트가 비었습니다.")

}