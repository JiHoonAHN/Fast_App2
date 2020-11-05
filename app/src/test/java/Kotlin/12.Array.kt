package Kotlin

//12. 배열

//배열이 필요한 이유
// - 집합이 필요할 때
fun main(array:Array<String>)
{

    //배열 생성하는 방법(1)
    var number :Int = 10
    var group1 = arrayOf<Int>()//<타입>을 적지 않으면 아무런 배열도 계속 넣을수 있다.
    println(group1 is Array)
    //배열을 생성하는 방법(2)
    var number1 =10
    var group2 = arrayOf(1,2,3,4,5,"Hello")

//배열의 값을 꺼내는 방법(1)
    group1.get()


}

private fun <T> Array<T>.get() {
    TODO("Not yet implemented")
}
