package Kotlin

//29. Generic(제너릭)

//목적: 다양한 타입의 객체들을 다루는 메거드나 컬렉션
//       클래스에서 컴파일 시에 타입을 체크하는 기능
// - 제너릭은 만들기 어렵고 실제로 만들일 거의 없기 때문에 사용하는 방법만 숙지

fun main(args: Array<String>){
    //제네릭 사용하지 않는 경우
    //형 변환을 해줘야한다.
    val list1 = listOf(1,2,3,"가")
    val b: String = list1[2].toString()//형변환(타입이 바뀐다.)


    //제네릭을 사용하는 경우-> 타입이 안전하다.
    val list2 = listOf<String>("a","b","c")
    val c:String = list2[2] // String 이란것을 보장 받는다


    //강한 타입 체크 가능
    val list3 = listOf(1,2,3,4,"가","나",3.0)
    val list4 = listOf<Int>(1,2,3,5)//강한 타입 체크


    //제너릭을 사용 하지 않은 경우
    val list5 = listOf(1,2,3,"가")//-> Any타입으로 지정
    //부모: Any
    //자식: String, Int ,Float


}