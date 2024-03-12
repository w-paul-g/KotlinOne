fun main(args: Array<String>) {
    //Conditional Statements

    //If Statement

    //e.g.
    var num = -100
    if (num < 0){
        println("This is a negative number.")
    }
    else{
        println("This is a positive number.")
    }

    //Multiple If Conditions

    //e.g
    var age = 19
    if (age < 10){
        println("You're in Primary School.")
    }
    else if (age>=10 && age<=14){
        println("You're in Junior Secondary School.")
    }
    else if (age>=15&&age<=18){
        println("You're in Senior Secondary School.")
    }
    else if (age>=19&&age<=25){
        println("You're in Campus")
    }
    else{
        println("You're an adult likely to be out of school.")
    }

    //When Statement

    //e.g.
    var letter = 'p'
    when(letter){
        'a'-> println("a is a vowel")
        'e'-> println("e is a vowel")
        'i'-> println("i is a vowel")
        'o'-> println("o is a vowel")
        'u'-> println("u is a vowel")
        else-> println("$letter is a consonant.")
    }

    var number = 3
    when(number){
        1 -> println("Too bad! You failed the game!")
        2 -> println("Wow! You almost got the number!")
        3 -> println("Congratulation! You are the WINNER!")
        else -> println("$number is invalid! Try Again!")
    }

    //e.g BMI Calculator
    var height = 1.32
    var weight = 70
    var bodymassindex = (weight/(height*height))
    if (bodymassindex < 18){
        println("You're underweight")
    }
    else if (18 <= bodymassindex){
        println("You're normal")
    }
    else if (25 <= bodymassindex){
        println("You're overweight")
    }
    else if(30 < bodymassindex){
        println("You're obese")
    }

}