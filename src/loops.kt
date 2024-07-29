fun main() {
    //while

    var number = 30
    while (number <= 35){
        println("Number is $number")
        number ++
    }
    var num = 10
    while (num >= 5){
        println(num)
        num --
    }

    //Break and continue
    var count = 100
    while (count <= 105){
        println("Count is $count")
        count++
        if (count == 103){
            break
        }
    }
    //Contnue
    var x = 25
    while (x <= 30){
        if (x == 27){
            x++
            continue
        }
        println(x)
        x++
    }
}