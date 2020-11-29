import kotlin.math.hypot
import kotlin.math.pow
import kotlin.math.sqrt
// import kotlin.math.*

fun main(args : Array<String>) {
    var x: Double = 16.0
    var y: Double = 5.0

    println("===============제곱근==================")
    // println(Math.sqrt(x))   // java.lang.sqrt
    println("${x}의 제곱근 = ${sqrt(x)}")
    println("${y}의 제곱근 = ${sqrt(y)}")


    println("===============제곱==================")
    println("${x}의 제곱 = ${x.pow(2)}")
    println("${y}의 세제곱 = ${y.pow(3)}")


    println("===============제곱의 합의 제곱근==================")
    // 2차원 좌표상 두점 사이 거리 구할 경우
    // 피타고라스 정리로 길이를 구할 경우
    println("(3제곱 + 4제곱)의 제곱근 = ${hypot(3.0, 4.0)}")
}