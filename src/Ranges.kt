//Ranges
//
fun main(args: Array<String>) {

    //1. Continuous Ranges

    //a. Ranges Moving Forward

    //i. The '..' Function

    //e.g. Numbers
    var number = -10..20

    //Using For Loop to Print The Range
    for (num in number) {
        println(num)
    }

    //e.g. Alphabets
    var alphabet = 'A'..'Z'
    for (char in alphabet) {
        println(char)
    }

    //ii. The .rangeTo() Function

    //e.g. Namba
    var namba = 1.rangeTo(5)
    for (x in namba){
        println(x)
    }

    //b. Ranges Moving Backward

    //i. Th .downTo() Function

    //e.g. Number1
    var number1 = 5.downTo(1)
    for (y in number1){
        println(y)
    }

    //e.g. Alphabets1
    var alphabet1 = 'Z'.downTo('A')
    for (z in alphabet1){
        println(z)
    }

    //2. Step Ranges

    //a. Ranges Moving Forward

    //i. The '..' Function

    //e.g Even Numbers
    var OneToTen = 0..10
    var even = OneToTen.step(2)
    for (w in even){
        println(w)
    }

    //e.g. Steps of five
    var TenToFiFty = 10..50
    var fives = TenToFiFty.step(5)
    for (q in fives){
        println(q)
    }




}