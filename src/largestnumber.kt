import java.util.Scanner

fun main() {

    var read = Scanner(System.`in`)

    println("Enter first number : ")
    var first = read.nextInt()

    println("Enter second number : ")
    var second = read.nextInt()

    if (first > second){
        println("$first is the largest")
    }
    else{
        println("$second is the largest")
    }
}