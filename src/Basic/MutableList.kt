package Basic

fun main() {
    val number = mutableListOf(1,2,3,4,5,6,7)
    number.add(8)
    number.add(9)
    number.removeAt(5)
    number[2] = 20
    println(number)
}