package Basic

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter Year: ")
    var y = scanner.nextInt()
    if (y % 400 ==0 || y % 4 == 0){
        println("$y is a Leap Year")
    } else if (y % 100 ==0){
        println("$y is not a Leap Year")
    }else {
        println("$y is not a Leap Year")
    }
}