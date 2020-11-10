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
    println()
    //반복하는 방법 (2)

    for((index , item) in a.withIndex()) {
        println("index: "+index+"value: "+item)
        //문자열 + Int(정수) = 문자열
        //문자열 + 아무거나 = 문자열
    }
    println()
    // 반복하는 방법 (3)
    a.forEach{
        println(it)//람다라는 문법
    }
    // 반복하는 방법 (4)
    a.forEach { item->// 변수명 : it 이 마음에 안들때 사용
        println(item)
    }
    a.forEachIndexed { index, item ->
        println("index: "+index+"value: "+item)
    }
}