fun main(args : Array<String>) {
    /*
    기존 참조하던 "abc" 뒤에 "def"를 추가하는 것이 아니라
    추가된 문자열 "abcdef"를 새로 생성하고 참조하는 것이다.
    그러면 쓰레기 "abc"가 남게되며 이러한 과정이 많아지면 비효율적
    var s1 = "ab"
    s1 += "cd"
    */

    val str = StringBuilder()   // 빈 생성자
    println("1. 문자열 : $str")
    /* 추가 */
    str.append(5)               // Int 타입
    str.append("gdfa")          // String 타입
    str.append('Q')             // Char 타입
    str.append(true)            // Boolean 타입
    str.append(5431)
    str.append("DFSDE")
    str.append("treq")

    println("2. 문자열 : $str")
    println("index=0 : ${str[0]}, index=5 : ${str[5]}")

    /* 삭제 */
    str.deleteCharAt(0) // index
    str.delete(0, 1)    // [start, end)
    println("3. 문자열 : $str")

    println("=========================================")
    val temp: String = "ABCD"
    val str2 = StringBuilder(temp)  // String을 받는 생성자
    println("1. 문자열 : $str2")
    println("길이 = ${str2.length}")
    println("뒤집기 = ${str2.reverse()}")

    str2.insert(0, "fds")   // index=0 위치에 추가
    println("2. 문자열 : $str2")

    val li = listOf("abc", "def", "ghi")
    str2.append(li.joinToString(""))
    println("3. 문자열 : $str2")

    println("4-1. 부분 문자열 : ${str2.substring(3)}")       // [3, length)
    println("4-2. 부분 문자열 : ${str2.substring(3, 7)}")        // [3, 7)
    println("4-3. 부분 문자열 : ${str2.substring(3..7)}")    // [3, 7]

    println("=========================================")
    val str3 = str2.toString()   // String Type으로 저장
    if(str3 is String) println("String Type")
    println("1. 문자열 : $str3")


}