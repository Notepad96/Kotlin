fun <T> combination(answer: MutableList<List<T>>, el: List<T>, ck: Array<Boolean>, start: Int, target: Int) {
    if(target == 0) {
        answer.addAll( listOf(el.filterIndexed { index, t -> ck[index] }) )
    } else {
        for(i in start until el.size) {
            ck[i] = true
            combination(answer, el, ck, i + 1, target - 1)
            ck[i] = false
        }
    }
}

fun main(args: Array<String>) {
    var arr = listOf(1, 2, 3, 4)    // 1. Int
    //var arr = "asdf".toList()   // 2. String

    for(i in 1 .. arr.size) {
        val answer = mutableListOf<List<Int>>()     // 1. Int
        // val answer = mutableListOf<List<Char>>() // 2. String
        println("================$i 개====================")
        combination(answer, arr, Array<Boolean>(arr.size) { false }, 0,  i)
        answer.forEach { println(it) }
    }

}
