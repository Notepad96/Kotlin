data class Book(var name: String, var writer: String, var price: Int)

fun main(args: Array<String>) {
    val arr = mutableListOf<Book>()
    arr.add(Book("name1", "writer1", 12000))
    arr.add(Book("name2", "writer2", 21000))
    arr.add(Book("name3", "writer3", 31000))
    arr.add(Book("name4", "writer4", 28000))
    arr.add(Book("name4", "writer5", 23000))

    println("===============1================")
    arr.forEach { println(it) }
    arr.shuffle()

    println("===============2================")
    arr.forEach { println(it) }
    arr.shuffle()

    println("===============3================")
    arr.forEach { println(it) }
}
