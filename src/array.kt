fun main() {
    var languages = arrayOf("Kotlin", "Python", "Java")

    println(languages[1])

    //Reassigning an element in an array
    languages[1] = "C++"
    println(languages[1])

    //Adding a new element into array
    var all = languages.plus("PHP")
    for (lang in all) {
        println(lang)
    }

    //Size of an array
    println(all.size)

}















