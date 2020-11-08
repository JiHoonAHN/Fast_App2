package Kotlin

//16. Iterable //반복문

fun main(array:Array<String>)
{
    val a = mutableListOf<Int>(1,2,3,4,5,6,7,8,9)


    //반복하는 방법(1)
    for (item in a){//item 에 a의 값이 첫번째 부터 끝까지 들어감
        if(item == 5)
        {
            println("item is Five")
        }else
        {
            println("item is not Five")
        }
    }



}