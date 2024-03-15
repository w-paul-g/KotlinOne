import java.awt.Color

//Inheritance
fun main(args: Array<String>) {
    //Child
    var child1 = Child()
    child1.myFunction()
    //Animal e.g. Dog
    var dog1 = Dog("Black", 6)
    dog1.woof()
    var cow1 = Cow("White", 3)
    cow1.moo()
    var cat1 = Cat("Beige", 2)
    cat1.meow()
    var chicken = Bird("Brown", 2)
    chicken.cluck()

}
//Parent
open class Parent(){
    val x = 5
}
//Child
class Child:Parent(){
    fun myFunction(){
        println(x)
    }
}

//e.g Animal
open class Animal(color: String, age: Int){
    init {
        println("Color is: $color")
        println("Age is: $age")
    }
}
//e.g. Dog
class Dog(color: String, age: Int):Animal(color, age){
    fun woof(){
        println("Dog makes the sound 'woof'")
    }
}
class Cow(color: String,age: Int):Animal(color, age){
    fun moo(){
        println("The cow makes a sound 'moo'")
    }
}
//Cat
class Cat(color: String, age: Int):Animal(color, age){
    fun meow(){
        println("The cat makes a sound 'meow'")
    }
}
//Bird
class Bird(color: String, age: Int):Animal(color, age){
    fun cluck(){
        println("The chicken makes a sound 'cluck'")
    }
}