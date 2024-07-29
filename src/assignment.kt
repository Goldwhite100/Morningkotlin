
import java.util.Scanner


fun main() {
    // Prompt user for input
    print("Enter a letter: ")
    val input = readLine()

    // Check if the input is valid
    if (input != null && input.length == 1) {
        val letter = input[0].toLowerCase() // Convert to lowercase to handle both uppercase and lowercase inputs

        if (letter in 'a'..'z') { // Check if the input is a letter
            if (letter in "aeiou") { // Check if the letter is a vowel
                println("$letter is a vowel.")
            } else {
                println("$letter is a consonant.")
            }
        } else {
            println("Input is not a letter.")
        }
    } else {
        println("Invalid input. Please enter a single letter.")
    }
}
