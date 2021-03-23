package org.opentutorials.javatutorials.polymorphism;
interface I2 {
	public String A();
}
interface I3 {
	public String B();
}
class D implements I2, I3 {
	public String A() {
		return "A";
	}
	public String B() {
		return "B";
	}
}

public class PolymorphismDemo3 {

	public static void main(String[] args) {
		D obj = new D();
		I2 objI2 = new D();
		I3 objI3 = new D();
		
		obj.A();
		obj.B();
		System.out.println(obj.A());
		
		objI2.A();
		//objI2.B(); B는 I3에서 정의하고있기 때문에 오류
		
		//objI3.A();
		objI3.B();
	}

}
