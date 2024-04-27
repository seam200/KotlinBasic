package Basic//number Array
//fun main() {
//    val num = arrayOf(1,2,3,5,6,8,9,10)
//    for (n in num){
//        if (n % 2 ==0){
//            println("$n")
//        }
//    }
//
//}

//String Array
//fun main() {
//    val p = arrayOf("A", "B", "C","D")
//    for (i in p.indices){
//        println(p[i])
//    }
//}

//list of
//fun main() {
//    val n = listOf(1, 2, 3, 4, 5)
//    for (i in n.indices){
//        println("Element at $i is ${n[i]}")
//    }
//}

//with index String
//fun main() {
//    val p = arrayOf("A", "B", "C")
//    for ((i, v ) in p.withIndex()){
//        println("Element at $i is $v")
//    }
//}

//with index list int

fun main() {
    val p = listOf(15, 25, 50)
    for ((i, v ) in p.withIndex()){
        println("Element at $i is $v")
    }
}