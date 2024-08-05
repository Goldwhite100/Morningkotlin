import java.util.Scanner

fun main() {

    // Prompt the user for input
    println("Enter the first number:")
    val num1 = readLine()?.toDoubleOrNull() ?: run {
        println("Invalid number")
        return
    }

    println("Enter an operator (+, -, *, /):")
    val operator = readLine()

    println("Enter the second number:")
    val num2 = readLine()?.toDoubleOrNull() ?: run {
        println("Invalid number")
        return
    }

    // Perform calculation based on operator
    val result = when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> if (num2 != 0.0) num1 / num2 else {
            println("Cannot divide by zero")
            return
        }
        else -> {
            println("Invalid operator")
            return
        }
    }

    // Display the result
    println("Result: $result")





    
}