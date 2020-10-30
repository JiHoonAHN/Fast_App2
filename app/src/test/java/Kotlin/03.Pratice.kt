package Kotlin

var a = 1 + 2 + 3 + 4 + 5//연산의 결괏값을 변수에 넣어 줄 수 있다.
var b = "1"
var c = b.toInt()
var d = b.toFloat()

var e = "John"
var f ="My name is $e Nice to meet you"


//Null
// - 존재하지 않는다.
var  abc1:Int? =null//"null"(X)
var abc:Double? =null
fun main(array:Array<String>)
{
    println(a)
    println(b)
    println(c)
    println(d)
    println(f)
}