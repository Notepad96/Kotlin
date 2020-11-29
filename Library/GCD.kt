fun gcd(a: Int, b:Int): Int = if(b != 0) gcd(b, a % b) else a

fun main(args : Array<String>) {
    var x = 4
    var y = 10
    println("최대 공약수 : ${gcd(x, y)}")
    println("최소 공배수 : ${x * y / gcd(x, y)}")

    x = 28
    y = 16
    println("최대 공약수 : ${gcd(x, y)}")
    println("최소 공배수 : ${x * y / gcd(x, y)}")
}