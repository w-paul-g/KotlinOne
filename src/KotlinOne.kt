fun main(args: Array<String>) {
    //1. Variables(var) - Dynamic
    //Here, the variable can be reassigned
    //(a) with data types
    //Integer
    var a:Int
    //String
    var b:String
    //Double
    var c:Double
    //Char
    var d:Char
    //Boolean
    var e:Boolean
    //Declaration
    a=23
    b="This is my first Kotlin"
    c=12.65
    d='s'
    e=true

    //(b) without data types
    var w=13
    var t="This is my string"

    //Output
    //Arithmetic
    println(a+c)
    println(a-c)
    println(a*c)
    println(a/c)
    //Variable
    var summation = a+c
    var difference = a-c
    var product = a*c
    var division = a/c
    //Declaration
    println(summation)
    println(difference)
    println(product)
    println(division)

    //2. Variables(val) - Constant
    //Here, the variable can't be reassigned
    //(a) with data types
    val y:String
    y="Yours Truly"

    //Variables, Declarations and Output
    var age:Int
    age = 23
    var height:Int
    height = 45

    //(a) Using the '$' sign
    println("Your age is $age and height is $height cm.")
    //(b) Using the '+' sign
    println("Your age is " + age + " and height is " + height + "cm.")


    //eg.
    var debtor : String
    debtor = "Paul"
    var debt:Double
    debt = 1000000.01
    var networth:Double
    networth= 5000000.00
    println("$debtor, who had a debt of Ksh. $debt, has a networth Ksh. $networth, making him one of the richest upcoming millionaires.")

}