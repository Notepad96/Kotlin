data class Book(var name: String, var writer: String, var price: Int)

fun main(args: Array<String>) {
    val arr = mutableListOf<Book>()
    arr.add(Book("name1", "writer1", 12000))
    arr.add(Book("name2", "writer2", 21000))
    arr.add(Book("name3", "writer3", 31000))
    arr.add(Book("name4", "writer4", 28000))
    arr.add(Book("name4", "writer5", 23000))

    println("===============1================")
    var arr2 = arr.associateBy { it.name }
    arr2.forEach { println(it) }


    println("===============2================")
    arr2.forEach { println(it.value.writer) }


    println("===============3================")
    val arr3 = arr.associateBy(Book::name, Book::writer)    // key to value
    arr3.forEach { println(it) }


    println("===============4================")
    val arr4 = arr.associate { it.writer to it.price }
    arr4.forEach { println("key = ${it.key}, value = ${it.value}") }
}
