fun main(args: Array<String>) {
    var str = "AgfDvFdsSD1234"
    println("문자열 = $str")
    println("문자열 대문자 변환 = ${str.toUpperCase()}")
    println("문자열 소문자 변환 = ${str.toLowerCase()}")


    val sl = str.toMutableList()
    for(i in sl.indices) {
        if(sl[i].isUpperCase()) {
            println("${sl[i]}는 대문자 입니다.")
            sl[i] = sl[i].toLowerCase()
        }
        else if(sl[i].isLowerCase()) {
            println("${sl[i]}는 소문자 입니다.")
            sl[i] = sl[i].toUpperCase()
        }
    }

    println("문자열 대문자 소문자 변경 = ${sl.joinToString("")}")

}