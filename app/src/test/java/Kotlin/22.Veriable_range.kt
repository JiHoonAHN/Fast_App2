package Kotlin
//변수의 접근 범위
//1. 전역변수 -> 여기저기서 접근 가능한것
//2. 지역 변수 -> 여기저기에서 접근 불가능

var number100 : Int = 10//아무나 갔다가 변경 가능-> ★위험 최소한 설정 중요★

fun main(arg:Array<String>) {
    println(number100)

    val test = Test("홀길동")
    test.name

}


class Test(var name:String ){

    fun testFun(){
        var birth : String = "2000/3/1"
        name = " 홍길동"
        number100 = 100
        fun testFun2(){
            var gender : String = "male"// 접근 범위 정해짐
        }
    }
    fun testFun2(){
        name
        //birth -> 지역번수
    }


}