fun main(args : Array<String>) {

    //var ms = mutableSetOf<Int>()
    var ms = mutableSetOf(1, 1, 2, 2, 4, 3)

    println("\n===============MutableSet====================")
    println(ms)


    println("\n=================삽 입================")
    ms.add(6)   // 맨 뒤에 6 삽입
    // ms += 5  // var을 사용하면 사용 불가   // plusAssign
    ms.addAll(Array(3, {8} ))   // 중복이 불가하므로 하나만 추가된다

    for(i in ms.indices) {  // index를 사용하여서 루프
        print("${ms.elementAt(i)} ")
    }
    println()



    println("\n================정 렬=================")
    ms = ms.toSortedSet()   // 오름차순 정렬
    // ms = ms.toSortedSet(compareByDescending { it })   // 내림차순 정렬
    ms.forEach { print("${it} ") }
    println()



    println("\n================삭 제=================")
    if(ms.remove(1)) println("1 삭제 성공!") else println("1 삭제 실패!")   // 1제거
    ms.removeAll(arrayOf(2, 3))     // 2, 3 제거
    println(ms)



    println("\n================프로퍼티=================")
    println("길이 : ${ms.size}")
    println("인덱스 Range : ${ms.indices}")



    println("\n================추 가=================")
    println("최대값 : ${ms.max()}")
    println("평균 : ${ms.average()}")
    println("합 : ${ms.sum()}")
    println("찾기 : ${ms.indexOf(6)}")    // 6이 있는 index 1
    println("찾기 : ${ms.indexOf(5)}")    // 5는 존재않으므로 -1

    ms.clear()
    if(ms.isEmpty()) println("MutableSet이 비었습니다.")

}