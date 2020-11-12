package Kotlin

// 23.접근 제어자


fun main(array:Array<String>){
    val testAcess:TestAcess = TestAcess("아무개")
    // private 키워드 때문에 외부에서 접속 불가
//    testAcess.test()
//    println(testAcess.name)
//    testAcess.name = "아무개 투"
//    println(testAcess.name)
    val reward:Reward = Reward()
    reward.rewardAmount = 2000

    val runningCar : RunningCar = RunningCar()
    runningCar.runFast()
//    runningCar.run()
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

    private fun test() {
        println("테스트")
    }


}
//private 쓰는 이유 - 외부에 공개하고 싶지 않은 코드를 가리기 위해서
class RunningCar(){
    fun runFast(){
        run()
    }
    private fun run(){//외부와 내부 단절

    }
}