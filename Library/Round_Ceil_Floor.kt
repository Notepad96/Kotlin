import kotlin.math.*

fun main(args : Array<String>) {
    var x: Double = 16.746
    var y: Double = 5.453

    println("===============올림==================")
    println("$x 올림 : ${ceil(x)}")
    println("$y 올림 : ${ceil(y)}")

    println("===============내림==================")
    println("$x 내림 : ${floor(x)}")
    println("$y 내림 : ${floor(y)}")

    println("===============반올림==================")
    println("$x 반올림 : ${round(x)}")
    println("$y 반올림 : ${round(y)}")

    println("반올림 후 Int : ${x.roundToInt()}")
    println("반올림 후 Long : ${x.roundToLong()}")


    println("===============반올림 응용==================")
    println("$x 소수점 아래 2번 째에서 반올림 : ${round(x*10)/10}")
    println("$y 소수점 아래 2번 째에서 반올림 : ${round(y*10)/10}")

    println("$x 소수점 아래 3번 째에서 반올림 : ${round(x*100)/100}")
    println("$y 소수점 아래 3번 째에서 반올림 : ${round(y*100)/100}")


}