// Inputs and Outputs
import java.util.Scanner
fun main(args: Array<String>) {

    //a. String Input
    //e.g.
    print("Please Enter Your Name: ")
    val enteredString = readLine()
    println(" You have entered the string $enteredString")

    //b. Integer Input
    //e.g.
    print("Please enter a number: ")
    var enteredNumber = Integer.valueOf(readLine())
    println("You've entered a number $enteredNumber")

    //A Scanner Class

    //a. Integer
    //e.g.
      var read = Scanner(System.`in`)
    println("Plese enter an integer: ")
    var enteredInteger = read.nextInt()
    println("The integer entered is $enteredInteger")

    //b. Float
    //e.g.
    println("Plese enter an Float: ")
    var enteredFloat = read.nextFloat()
    println("The Float entered is $enteredFloat")

    //e.g. Calculations
    println("Num 1: ")
    var enteredFloat1 = read.nextFloat()
    println("Num 2: ")
    var enteredFloat2 = read.nextFloat()
    var multiplication = enteredFloat1 * enteredFloat2
    println("$multiplication")

}