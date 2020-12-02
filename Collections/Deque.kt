import java.util.ArrayDeque

fun main(args : Array<String>) {
    var dq = ArrayDeque<Int>()
    /* 삽입 */
    dq.add(5)
    dq.addFirst(2)  // 앞에 삽입
    dq.addLast(4)   // 뒤에 삽입
    dq.add(3)          // 뒤에 삽입

    println("==================삽 입==================")
    println(dq)
    println("Size : ${dq.size}")
    println("3 존재 : ${dq.contains(3)}")
    println("1 존재 : ${dq.contains(1)}")

    dq.forEachIndexed { index, i -> print("${index}:${i} ") }

    println("\n==================접 근==================")
    println("index 3 = ${dq.elementAt(3)}")
    println("index 1 = ${dq.elementAt(1)}")
    println("맨 앞 : ${dq.first}")
    println("맨 뒤 : ${dq.last}")

    println("==================삭 제===================")
    println("앞에 삭제 : ${dq.remove()}")   // 맨 앞 삭제
    // println("앞에 삭제 : ${dq.removeFirst()}")
    println("앞에 삭제 : ${dq.removeLast()}")

    println(dq)
}