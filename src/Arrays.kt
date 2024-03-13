//Arrays
//The items are indexed, hence, ordered.
//NOTE: The index start from 0.
fun main(args: Array<String>) {

    //(a) All Data Structures
    //e.g.
    var arr = arrayOf(10, 23.4,"John", 'w')

    //(b) Integer
    //e.g.
    var arr1 = arrayOf<Int>(12, 34, 54, 65, 765)

    //(c) Strings
    //e.g.
    var arr2 = arrayOf<String>("Paul", "Chris", "MOses", "Martin")

    //Array Modification

    //a. Using Indices

    //e.g. Fruits
    // Before
    var fruits = arrayOf("Oranges", "Mangoes", "Pineapples")
    // Using [2]
    println(fruits[2])
    // Modification
    fruits[2] = "Apples"
    // After
    println(fruits[2])

    //b. Using Set Function

    //e.g. Names of People
    var names = arrayOf("Esther", "Ndung'u", "Wanjiru", "Kinuthia")
    // Before
    println(names[2])
    // Changing [2]
    names.set(2, "Andrew")
    // After
    println(names[2])

    //Changing [3]
    println(names[3])
    names.set(3, "Mwanza")
    println(names[3])

    //Fetching values in Arrays

    //a. Using get Function

    //e.g  Browsers
    var browsers = arrayOf("Safari", "Opera", "Chrome", "Edge", "Firefox", "Vivaldi")
    // Fetching using index [2]
    println(browsers[2])
    // Fetching using get function
    println(browsers.get(2))

    //Changing [5]
    println(browsers.get(5))

}