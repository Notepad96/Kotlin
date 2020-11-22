class Book {
    constructor(name : String, price : Int) {
        this.name = name
        this.price = price
    }

    var name: String
        get() = field
        set(value) {
            field = value
        }

    var price: Int
        get() {
            println("$field 읽기")
            return field
        }
        set(value) {
                field = value
                println("$field 쓰기")
        }
}


fun main(args: Array<String>) {
    val bk = Book("abc", 341)
    bk.price = 12345
    println("${bk.name} : ${bk.price}")

}
