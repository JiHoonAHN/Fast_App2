package Kotlin

//27. Interface
// - 인터페이스는 약속! - 니가 이것을 구현하면 너도 이 타입이다.
//- 생성자가 없다 - > 인스턴스화를 시킬수 없다-> 설명서가 아니다
//- 지침서 -> 니가 이것을 구현하고 싶다면 반드시 아래 기능을 구현하라

//상속이 만들어낸 특징
//- 자식 클래스는 부모 클래스의 타입이다.
//- 부모 클래스는 자식 클래스의 타입이아니다.

//상속과 다른점
//- 상속은 조상을 찾아가는 느낌
//- 인터페이스는 종의 특징
interface Person_{
    fun eat()
    fun sleep()
}
fun main(arg:Array<String>){
    val student_ :Student_=Student_()
    student_.eat()
    student_.sleep()
}

class Student_:Person_{
    override fun eat() {

    }
    override fun sleep() {

    }
}
class SoccerPlay: Person_{
    override fun eat() {

    }
    override fun sleep() {

    }
}
class Teacher_:Person_{
    override fun eat() {

    }

    override fun sleep() {

    }

}


open class Person(){
    open fun eat(){

    }
    open fun sleep(){

    }
}

class Student() : Person(){

}
class Teacher() : Person(){

}
