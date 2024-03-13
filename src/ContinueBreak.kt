fun main(args: Array<String>) {

    //Continue

    //e.g. Numbers
    for (n in 1..5){
        println("before continue, loop $n.")
        if(n==2||n==4)
            continue
        println("after continue, loop $n.")
    }

    //Break

    //e.g. Numbers
    for (m in 1..10) {
        println("before break, loop $m")
        if (m == 5) {
            println("Terminating the loop...")
            break
        }
    }

    //e.g. Alphabets
    for (alphabet in 'a'..'z'){
        println("$alphabet")
        if (alphabet == 'q'){
            break
        }
    }
}