data class Pair2(var first:Int, var second: Double)
// data class Pair<T, U>(var first:Int, var second: Double)

fun main(args : Array<String>) {
    var arr = List<Pair<Int, Double>>(4) { Pair<Int, Double>(0, 0.0) }
    // arr[0].first++  // error : Val cannot be reassigned

    var arr2 = List<Pair2>(4) { Pair2(0, 0.0) }
    arr2[0].first++
    arr2[1].second += 5
    arr2[2].first = 100
    arr2.forEach { println(it) }

}
