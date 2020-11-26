fun main(args : Array<String>) {
    println("=============LIST================")
    val ml = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(ml)

    val any = ml.any { it % 2 == 0 }
    println("리스트의 짝수인 원소가 존재하나요? ${any.toString()}")

    val all = ml.all { it > 1 }
    println("리스트의 모든 수가 1보다 큰가요? ${all.toString()}")

    val none = ml.none { it > 10 }
    println("리스트의 10보다 큰 수가 없나요? ${none.toString()}")



    println("=============MAP================")
    val mm = mutableMapOf(1 to "asd", 3 to "zxc", 2 to "gse", 4 to "qwg")
    val mapAny = mm.any { it.key > 2 }
    println(mapAny)
}