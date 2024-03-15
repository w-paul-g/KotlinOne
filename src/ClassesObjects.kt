import java.time.Year

//Classes and Objects
//Main Function
fun main(args: Array<String>) {
    //Objects
    //Car
    val car1 = Car("Ford", "MUstang", 1960)
//    car1.model = "Ford"
//    car1.brand = "Mustang"
//    car1.year = "1960"
    println(car1.model)
    println(car1.brand)
    println(car1.year)
    val car2 = Car("Toyota", "Allion", 2001)
//    car2.model = "Toyota"
//    car2.brand = "Allion"
//    car2.year = "2001"
    println(car2.model)
    println(car2.brand)
    println(car2.year)
    //Bulb
    val bulb1 = Bulb()
    bulb1.turnOn()
    bulb1.displayLightStatus("bulb1")
    bulb1.turnOff()
    bulb1.displayLightStatus("bulb1")
    val bulb2 = Bulb()
    bulb2.turnOn()
    bulb2.displayLightStatus("bulb2")
    bulb2.turnOff()
    bulb2.displayLightStatus("bulb2")
    //Person
    val person1 = Person("Larry", 16)
    person1.canVote(person1.age)
    val person2 = Person("Singh", 19)
    person2.canVote(person2.age)
    val person3 = Person("Lou", 30)
    person3.canVote(person3.age)
    val person4 = Person("Bridget", 18)
    person4.canVote(person4.age)


}
//Body
//Car
//Data Variables
//1. With primary constructor
class Car(var model:String, var brand:String, var year:Int){
//    var model = ""
//    var brand = ""
//    var year = ""
    //Functions (Methods)
}

//BUlb
class Bulb{
    var isOn:Boolean =false
    fun turnOn(){
        isOn=true
    }
    fun turnOff(){
        isOn=false
    }
    fun displayLightStatus(bulb: String){
        if (isOn==true){
            println("The $bulb is ON!")
        }
        else{
            println("The $bulb is OFF!")
        }
    }
}
//Person
class Person(var name: String, var age: Int){
    fun canVote(age: Int){
        if (age<18){
            println("Can't vote")
        }
        else{
            println("Can vote")
        }

    }
}
