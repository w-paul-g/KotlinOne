import java.util.Scanner

// Functions
fun main(args: Array<String>) {
    // Running Functions
    println(BirthdayGreeting("Andrew", 18, "Lawrence"))
    println(BirthdayGreeting("Ian", 19, "Felix"))
    println(BirthdayGreeting("Paul", 20,"Mwangi"))
    println(BirthdayGreeting("Ruto", 54, "Rigathi"))
    println(BirthdayGreeting(age=40, regards = "Morris"))
    println(BirthdayGreeting(age=40, regards = "Ozil"))

    println(WelcomeUser("Andrew"))
    println(WelcomeUser("Ian"))
    println(WelcomeUser("Paul"))
    println(WelcomeUser("Lawrence"))
    println(WelcomeUser("Felix"))
    println(WelcomeUser("Mwangi"))
    println(WelcomeUser("Rigathi"))
    println(WelcomeUser("Mwanza"))

    println(Area(12.0))

    println( BodyMassIndex(70.0, 1.5))

    }
fun BirthdayGreeting(name: String="Chris", age : Int, regards : String): String {
    val m = "Happy Birthday $name."
    val n = "You are $age years old!"
    val p = "Regards from $regards."
    return "$m\n$n\n$p"
}
fun WelcomeUser(name : String): String{
    val Greetings = "Hello $name, welcome to the test. I hope everything is fine."
    return "$Greetings"
}

fun Area(radius : Double): Double{
    val circle = 3.14*(radius*radius)
    return circle
}

fun BodyMassIndex(weight : Double, height : Double): Double{
    val BodyMassIndex = weight/(height*height)
    return BodyMassIndex
}
