fun main(args: Array<String>) {
    val str = "abc123def"
    println("==============String==================")
    println(str)

    val tmp = str.slice(0..2)
    println("==============Slice==================")
    println(tmp)

    val len = str.length
    val tmp2 = str.slice(len-3..len-1)
    println("==============Slice2==================")
    println(tmp2)

    val arr = str.toList().subList(0, 2)
    println("==============LIST==================")
    println(arr)

    val arr2 = str.toList().slice(0..2)
    println("==============LIST2==================")
    println(arr2)
}
