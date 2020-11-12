package Kotlin

// 23.접근 제어자


fun main(array:Array<String>){
    val testAcess:TestAcess = TestAcess("아무개")
    testAcess.test()
//    println(testAcess.name)
//    testAcess.name = "아무개 투"
//    println(testAcess.name)
    val reward:Reward = Reward()
    reward.rewardAmount = 2000
}

class Reward(){
    var rewardAmount: Int = 1000
}
class TestAcess{
    private var name: String = "홍길동"//private 외부에서 변경 불가.

    constructor(name :String) {
        this.name = name

    }
    fun ChangeName(newName:String){
        this.name = newName
    }
    fun test()
    {
        println("테스트")
    }

}