import kotlin.math.*

fun main(args : Array<String>) {
    var r = 5
    println("PI : $PI")
    println("E : $E")
    println("반지름 ${r}인 원의 넓이 : ${r * r * PI}")  // kotlin.math.PI
    r = -12
    println("${r}의 절댓값 : ${abs(r)}")    // kotlin.math.abs
    println("부호 확인 : ${r.sign}")    // 양수 1.0, 0, 음수 -1.0


    println("===============2개 숫자 중 가장 큰값, 작은값=================")
    var a = 10
    var b = 30
    var c = 40
    println("${a}와 ${b} 중 더 큰 값 = ${max(a, b)}")    // kotlin.math.max
    println("${c}와 ${b} 중 더 작은 값 = ${min(c, b)}")   // kotlin.math.min

    println("===============숫자 여러개 중 가장 큰값, 작은값=================")
    println("${a}, ${b}, ${c} 중 가장 큰 값 = ${listOf(a, b, c).max()}")
    println("${a}, ${b}, ${c} 중 가장 작은 값 = ${listOf(a, b, c).min()}")
}

