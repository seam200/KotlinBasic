package Basic

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val name = scanner.nextLine()
    val age = scanner.nextInt()
    val gender = readLine()!!
    val year = readLine()!!.toString()

    println(name)
    println(age)
    println(gender)
    println(year)
}