class Dog(var name:String,var breed:String,var age:Int) {

}

fun main() {

    var dog1 = Dog("Tito", "German Shephard", 6)
    println(dog1.name + " " +dog1.breed)
    var dog2 = Dog("Bob","Kienyeji",5)
    println(dog2.name + " " +dog2.breed)
    var dog3 = Dog("Ann","Hiberian",3)
    println(dog3.name  + " " + dog3.breed)

}