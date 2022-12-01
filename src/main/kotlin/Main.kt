import kotlin.time.measureTimedValue

fun main() {

//    operators()
//    conditions()
//    nullability()
//    listsAndArrays()
}

fun operators(){


    var a = 5
    val b = 3.0

    println ("a =" + a+"b =" +b)

    println( "a + b = ${a + b}")
    println( "a - b = ${a - b}")
    println( "a * b = ${a * b}")
    println( "a / b = ${a / b}")
    println( "a % b = ${a % b}")

    a+= 2
    println(a)

}

fun conditions(){
//boolean
    val isTooLate = true

    if (isTooLate){

        println("you must sleep its too late")
    }else {
        println("we can still watch TV")

    }

//when

    when (13){

        in 7..10 -> println("good morning")
        in 11..15 -> println("good after noon")
        in 15..20 -> println(" good evening")
    }
}

fun nullability() {

    var name:String? = "Sohaib"
    val lastName= "saber"
    name = null
    println("Hello $name $lastName")
}

fun listsAndArrays(){

//    lists
    val meenu = listOf("pizza","burger","qabili")
    println(meenu)

    var menu = mutableListOf("pizza","qabili","burger")
    menu.remove("burger")

//for loop

        var list:List<String> = listOf("khayam", "mulana","Saadi","haafez")

    for ((index, value ) in list.withIndex()){

        println(index)
        println(value)
    }

//    while loop
    var i =5
    do {
        println("while loop "+i)
        i++
    }while (i<5)


}