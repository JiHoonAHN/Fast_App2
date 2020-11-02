package Kotlin

import java.util.ArrayList


//18.Class
// OOP-> Object Oriented Programing(객체지향 프로그래밍)
//객체랑 뭘까?
//- 이름이 있는 뭐든 것
// 절차 지향 프로그래밍 : 코드를 위에서 부터 아래로 실행 하면 문제 해결
//객체 지향 프로그래밍: 객체를 만들어서 객체에게 일을 시켜서 문제를 해결한다
//선수 ,  심판, 경기장, 관중, -> 축구 게임


//객체를 만드는 방법
// - 설명서가 있어야 한다
fun main(array:Array<String>)
{
    //클래스(설명서)를 통해서 실체를 만드는 방법
    //-> 인스턴스화-> 인스턴스(객체)
    Car("v8 engine","big")
    val bigCar = Car("v8 engine","big")
    //우리가 만든 클래스는 자료형이 된다.
    val bigCar1:Car = Car("v8 engine","big")
    val number :Int =10
    var number1 = 20
    val superCar:SuperCar = SuperCar("good engine","big","white")
}

//클래스(설명서) 만드는 방법(1)
class Car(var engine:String,body:String){}

//클래스(설명서) 만드는 방법(2)
class SuperCar{
    var engine : String = ""
    var body : String = ""
    var door : String = ""

    constructor(engine : String,body:String,door:String)
    {   println(engine)
        println(body)
        println(door)

        this.engine = engine
        this.body = body
        this.door = door
    }
}
fun abc(title:String,book:String)
{

}
// 클래스(설명서) 만드는 방법(3)->1번 방법의 확장
class Car1(engine: String,body: String)
{   var door :String = ""

    // 생성자
    constructor(engine: String,body: String,door: String): this(engine,body){ // this= Car1
        this.door = door
    }

}
