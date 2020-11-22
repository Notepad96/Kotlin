@OptIn(ExperimentalStdlibApi::class)
fun main(args: Array<String>) {
    // val arr = ArrayList<Int>()
    val arr = arrayListOf<Int>(5, 3, 1, 4, 2, 6)

    println("=============Array List=================")
    arr.forEach( {print("$it ")})



    println("\n=============삽 입=================")
    /* 삽입(add) */
    arr.add(7)
    arr.add(9)
    arr.add(8)
    arr += 10
    arr.add(1)
    arr.add(0, 100) // index = 0에 100 삽입


    println(arr.lastIndexOf(1)) // 뒤에서부터 1을 찾아 index 반환, 없다면 -1
    println("size = ${arr.size}")
    arr.forEach( {print("$it ")})



    println("\n==============삭 제================")
    /* 삭제(remove) */
    println("1 삭제 성공 : ${arr.remove(1)}")   // 앞에서부터 1을 찾아 삭제하고 true 반환
    println("1 삭제 성공 : ${arr.remove(1)}")
    println("1 삭제 성공 : ${arr.remove(1)}")   // 존재하지 않는다면 false 반환
    arr.removeAt(0) // index = 0 원소 삭제
    arr.removeAt(arr.size-1) // 마지막 원소 삭제

    /* 사용하기 위해서 @ ExperimentalStdlibApi 를 해주어야 한다. */
    arr.removeLast()    // 마지막 원소 삭제
    // arr.removeFirst()    // 처음 원소 삭제
    // arr.removeLastOrNull()   // 마지막 원소 삭제, list가 비어있을 경우 null 반환 위 함수들은 error 발생

    arr.forEach( {print("$it ")})



    println("\n============ArrayList to Array==================")
    /* ArrayList to Array */
    if(arr is ArrayList<Int>) { // Java에서 ArrayList
        println("ArrayList")
    }

    val arr2 = arr.toArray()    // Java에서 Array(배열)
    if(arr2 is Array) {
        println("Array")
    }
    // arr2.add() 존재 X

}