fun main() {
    //Predefined Functions
    println("eMobilis")

    var squareroot= Math.sqrt(81.0)
    println("The square root is $squareroot")

    var round = Math.round(32.67)
    println("The result is $round")

    var myceil = Math.ceil(45.21)
    println("The output value is $myceil")
    day()
    add()
    student("Gift",19)
    student("Patrick",20)


}

//User-defined Functions
fun day(){
    println("Today is Tuesday ")
}

fun add(){
    var num1 = 56
    var num2 = 100
    println(num1+num2)


}

//Parameter and argument
fun student(name:String,age: Int){
    println("$name is $age years old")

}