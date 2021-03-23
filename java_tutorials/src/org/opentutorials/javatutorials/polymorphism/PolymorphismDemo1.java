package org.opentutorials.javatutorials.polymorphism;
class A{
	public String x() { return "A.x" ;}
}
class B extends A{
	public String x() {return "B.x" ;}//클래스 A의 x를 오버라이딩
	public String y() {return "y" ;}
}
class B2 extends A{
	public String x() {return "B2.x" ;}
}
public class PolymorphismDemo1 {

	public static void main(String[] args) {
		A obj = new B();
		//클래스 B로 인스턴스를 만들었지만 그 인스턴스는 클래스 A의 데이터 타입 행세
		A obj2 = new B2();
		System.out.println(obj.x());
		System.out.println(obj2.x());
		//obj.x();
		//obj.y(); 부모 클래스A에는 y가 없기때문에 오류.
	}

}
