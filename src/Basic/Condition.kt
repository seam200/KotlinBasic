package Basic

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    if (a > b || a > c) {
        println("a is greater")
    } else if (b > a || b > c) {
        println("b is greater")
    } else if (c > a || c > b) {
        println("c is greater")
    } else if (a == b && a > c) {
        println("a & b both are greater then c")
    } else if (a == c && a > b) {
        println("a & c both are greater then c")
    } else if (b == c && b > a) {
        println("b & c both are greater then c")
    } else {
        println("They are equal")
    }
}