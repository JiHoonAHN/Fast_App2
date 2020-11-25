package Kotlin

//28. practice (Interface)
//- 인터페이스도 구현이 있는 함수를 만들수 있다.
// - 인터페이스는 약속! - 니가 이것을 구현하면 너도 이 타입이다.
//- 생성자가 없다 - > 인스턴스화를 시킬수 없다-> 설명서가 아니다
//- 지침서 -> 니가 이것을 구현하고 싶다면 반드시 아래 기능을 구현하라
//- 인터페이스에 구현이 있는 함수는 그 인터페이스를 구현하는 클래스에서 그 함수를 구현할 필요가 없다.

//상속이 만들어낸 특징
//- 자식 클래스는 부모 클래스의 타입이다.
//- 부모 클래스는 자식 클래스의 타입이아니다.

//상속과 다른점
//- 상속은 조상을 찾아가는 느낌
//- 인터페이스는 종의 특징
interface Person__{
    fun eat(){
        //구현을 여기서도 할수 있다.
        println("먹는다")
    }
    fun sleep(){
        println("잔디")
    }
    abstract fun study()
}
fun main(arg:Array<String>){
    val student = Student_()
    student.sleep()
}

class Student__:Person__{
    override fun study() {

    }
}

class Teacher__:Person__ {
    override fun study() {

    }
}