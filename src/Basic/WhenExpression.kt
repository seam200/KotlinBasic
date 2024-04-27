package Basic//fun main(args: Array<String>) {
//    val a = 12
//    val b = 5
//
//    val op = "+"
//    when(op){
//        "+" -> {
//            println(a+b)
//        }
//        "-" ->{
//            println(a-b)
//        }
//        "*" ->{
//            println(a*b)
//        }
//        "/" ->{
//            println(a/b)
//        }
//        "%" ->{
//            println(a%b)
//        }
//        else->{
//            println("$op no valid")
//        }
//    }
//}

fun main(args: Array<String>) {
    val a = 20
    val b = 5

    val op = readLine()!!
    val result = when(op){
        "+" -> {
            a+b
        }
        "-" ->{
            a-b
        }
        "*" -> {
            a*b
        }
        "/" -> {
            a/b
        }
        "%" ->{
            a%b
        }
        else ->{
            "$op no valid"
        }
    }
    println(result)
}