import java.util.Stack

fun main(args : Array<String>) {
    val stack = Stack<Int>()

    /* 삽입 */
    stack.push(4)
    stack.push(5)
    stack.push(3)
    stack.push(2)
    println("================삽 입==================")
    println("Push : ${stack.push(1)}")  // 가장 위에 삽입
    stack.add(0, 10)    // index = 0(가장 아래), 10 삽입


    println("================탐 색==================")
    println(stack)
    println("현재 Top : ${stack.peek()}")
    println("Size = ${stack.size}")
    println("Index 0 = ${stack[0]}")
    println("원소 4 나갈 순서 = ${stack.search(4)}")  // Index 아님, 위에서부터 5번 째에 있다. + 위에서부터 탐색한다.
    println("없는 원소 탐색 = ${stack.search(123)}")  // 없으면 -1


    println("=================삭 제==================")
    while(stack.isNotEmpty()) {
        println("POP : ${stack.pop()}") // Pop 하면서 원소를 반환해준다
    }

}

