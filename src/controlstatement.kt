import java.util.Scanner

fun main() {

    var read = Scanner(System.`in`)
    println("Enter temprature of patient : ")
    var temprature = read.nextInt()
    if (temprature > 37){
        println("High Fever")
    }
    else if (temprature< 37){
        println("Low Fever")
    }
    else{
        println("Normal temprature")
    }




}