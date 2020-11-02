package Kotlin

//o4. Function
//-함수
//      -어떤 input 을 넣어주면 어떤 output 나오는 것
//      -y = x + 2

//함수를 선언방법
//fun 함수명(변수명:타입,변수명:타입...):반환형{
//함수 내용
//return 반환값
// }
fun plus(first:Int , second:Int):Int{
    println(first)
    println(second)

    val result:Int = first + second
    println(result)
    return result
}
// - 디폴트 값을 갖는 함수 만들기
fun plusFive(first: Int,second: Int = 5):Int
{
    val result  : Int  = first +second
    return result
}
//반환값이 없는 함수(Unit)
fun printPlus(first: Int,second: Int):Unit {
    val result : Int = first + second
    println(result)
}
fun main(array:Array<String>) {
    //함수를 호출 하는 방법
    val result = plus(5,10)
    println(result)
    //인수를 명시적으로 전달하는 방법
    val result2 = plus(first = 20 , second = 30)
    println(result2)
    val result3 = plus(second = 100,first = 10)
    println(result3)
    val result4 =plusFive(10,20)
    println(result)
    val result5 = plusFive(10)
    println(result5)
    val result6=printPlus(10,20)
    println()
    print(result6)
}