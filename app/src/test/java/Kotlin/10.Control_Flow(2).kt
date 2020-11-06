package Kotlin

//10. 제어 흐름

//When

fun main(args:Array<String>)
{
    val value : Int = 1

    when(value){
        1 -> {
             println("Value is 1")
        }
        2-> println("Value is 2")
        3->println("Value is 3")
        else-> println("Value is 4")

    }
    val value2 =when(value)
    {
        1->10
        2->20
        3->30
        else->100
    }
    println(value2)
}