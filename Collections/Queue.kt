import java.util.LinkedList

fun main(args : Array<String>) {
    var q = LinkedList<Int>()
    q.offer(1)  // = q.add(1)
    q.offer(2)
    q.offer(3)
    q.offer(4)
    println("===================삽 입=======================")
    println(q.add(5))     // 삽입
    println(q.add(0, 100))  // index = 0에 100 삽입

    println("=====================탐 색=======================")
    println(q)
    println("맨 앞 = ${q.peek()}")    // = q.element()
    println("Size = ${q.size}")
    println("index 0 = ${q[0]}")
    println("5 포함 여부 : ${q.contains(5)}")
    println("10 포함 여부 : ${q.contains(10)}")


    println("===================삭 제=======================")
    while(q.isNotEmpty()) { // <-> isEmpty()
        println("Pop : ${q.poll()}")    // = q.remove()
    }

}

