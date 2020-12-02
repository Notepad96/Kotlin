import java.util.*

fun main(args : Array<String>) {
    val pq = PriorityQueue<Int>()

    val pq2 = PriorityQueue<Int>(Collections.reverseOrder())
    /* 삽입 */
    pq.add(4)
    pq.addAll(listOf(1, 3, 5, 6, 6))
    pq.offer(2)

    pq2.addAll(listOf(1, 3))
    pq2.add(4)
    pq2.add(5)
    pq2.add(6)
    pq2.add(6)

    println("삽입 성공 여부 ${pq2.add(2)}")
    println(pq)
    println(pq2)

    println("====================탐 색====================")
    println("pq 4 포함 여부 : ${pq.contains(4)}")
    println("pq Size : ${pq.size}")
    println("pq 맨 위 : ${pq.peek()}")
    println("pq2 맨 위 : ${pq2.peek()}")


    println("===================삭 제=====================")
    print("pq2 = ")
    while(pq2.isNotEmpty()) print("${pq2.poll()} ")     // 삭제 후 반환


    println("\n====================삭 제====================")
    print("pq = ")
    while (pq.isNotEmpty()) print("${pq.remove()} ")    // 삭제 후 반환
}