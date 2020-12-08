data class Book(var name: String, var writer: String, var price: Int)

fun main(args: Array<String>) {
    val arr = mutableListOf<Book>()
    arr.add(Book("name1", "writer1", 12000))
    arr.add(Book("name2", "writer2", 21000))
    arr.add(Book("name3", "writer3", 31000))
    arr.add(Book("name4", "writer4", 28000))
    arr.add(Book("name4", "writer5", 23000))

    println("===============1================")
    var arr2 = arr.groupBy { it.name }
    arr2.forEach { println(it) }


    println("===============2================")
    val li = arr2["name4"]
    if(li is List<Book>) li.forEach { println(it) }


    var arr3 = listOf("One", "two", "Three", "four", "Five")
    println("===============3================")
    val arr4 = arr3.groupBy { it.first().toUpperCase() }    // Key
    arr4.forEach { println(it) }


    println("===============4================")
    val arr5 = arr3.groupBy( {it.first().toUpperCase()}, {it.toUpperCase()} )   // Key, Value
    arr5.forEach { println(it) }


    println("===============5================")
    val arr6 = arr3.groupingBy { it.first().toUpperCase() }.eachCount()
    arr6.forEach { println(it) }

}
