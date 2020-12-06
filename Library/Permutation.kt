fun <T> permutation(el: List<T>, fin: List<T> = listOf(), sub: List<T> = el ): List<List<T>> {
    return if(sub.isEmpty()) listOf(fin)
        else sub.flatMap { permutation(el, fin + it, sub - it) }
}

fun main(args: Array<String>) {
    val list = mutableListOf('a', 'b', 'c', 'd')
    val list2 = permutation(list)
    list2.forEach { print("$it ") }
    println()

    val list3 = mutableListOf(1, 2, 3, 4, 5)
    val list4 = permutation(list3)
    list4.forEach { print("$it ") }
    println()

    val str = "abcd"
    val list5 = permutation(str.toList())
    list5.forEach { print("$it ") }
}