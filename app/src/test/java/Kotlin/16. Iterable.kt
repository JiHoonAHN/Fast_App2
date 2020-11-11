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
    //반복하는 방법(5)
    a.forEachIndexed { index, item ->
        println("index: "+index+"value: "+item)
    }
    //반복하는 방법(6)
    println(a.size)// 9
    println()
    for(i in 0 until  a. size){
        //until은 마지막을 포함하지 않는다.
        //0부터 8까지 이다.
        println(a.get(i))
    }

        //반복하는 방법(7)
    for(i in 0 until a.size step (2)){
        println(a.get(i))
    }
    println()

    //반복하는 방법
    for (i in a.size - 1 downTo (0))
    {
        //8부터 0까지 반복
        println(a.get(i))
    }

    // 반복하는 방법(9)
    for (i in a.size -1 downTo(0) step(2)){
        println(a.get(i))
    }

    //반복하는 방법 (10)
    for (i in 0 .. a.size){
        // .. -> 마지막을 포함한다.
        println(i)
    }
    println()

    //반복하는 방법(11)
    var b: Int = 0// -> 1 -> 2 -> 3 -> 4
    var c: Int = 4
    while(b < c){
        b++ // while문을 정지 시키기 위한 코드
        println("b")
    }


    var d: Int = 0
    var e: Int = 4

    //반복하는 방법(12)
    do{
        println("hello")
        d++
    }while(d < e)//무조건 한번은 출력


}