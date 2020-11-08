package Kotlin

//14. collection
// -> list, set, map
// List
// 바꿀수 없음
fun main(args:Array<String>)
{
    //Immutable Collection
    // List
    val numberList = listOf<Int>(1,2,3)
    println(numberList)//출력: [1,2,3] -> 중복 허용
    println(numberList.get(0))
    println(numberList[0])

    //Set
    // - > 중복 허용 x
    // - > 순서가 없다
    val numberSet = setOf<Int>(1,2,3,3,3)
    println(numberSet)//출력:[1,2,3] 수학의 집합이라고 생각 -> 중복 허용 x
    numberList.forEach {
        println(it)
    }
    // Map -> Key,value 방식으로 관리한다.
    val numberMap = mapOf<String , Int>("one" to 1)
    println()
    println(numberMap.get("one"))
    // Mutable Collection(변경가능)
    val mnumberList = mutableListOf<Int>(1,2,3)
    mnumberList.add(3,4)
    println()
    println(mnumberList)//대괄호

    val mnumberSetof = mutableSetOf<Int>(1,2,3,4,5)
    mnumberSetof.add(10)
    println(mnumberSetof)//대괄호

    val mNumberMap = mutableMapOf<String,Int>("one" to 1)
    mNumberMap.put("two",2)
    println(mNumberMap)//중괄호로 묶임
}
