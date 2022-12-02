

fun main() {
//    println("the square 2 is ${square(2)}")

//    sayHELLO()

//    filter()

//    addTowNumber(3, 8,myLambdaFunc)


}

fun square(x : Int) : Int = x * x

fun sayHELLO(firstName : String = "Sohaib", isNameSohaib: Boolean = isNameSohaib(firstName)) {
    if (isNameSohaib){
    println("hello $firstName")
    }else{
        println("access denied")
    }
}

//compact function
fun isNameSohaib(name: String ) = name == "Sohaib"

//filter
fun filter (){

     var values = listOf<Int>( 8, 4, 3, 9, 10, )
     var evens = values.filter { it % 2 == 0 }
     var doubleValues = evens.map { it * 2 }
//    filter
     evens.forEach( { println(it) })
//    map
    doubleValues.forEach({ println(it) })

}

//lambda
    val myLambdaFunc: ( Int, Int ) -> Int = { x, y -> x + y }
//highOrder
fun addTowNumber(a: Int, b: Int, myfunc:( Int , Int ) -> Int ){
    var result = myfunc( a, b)
    println(result)

}