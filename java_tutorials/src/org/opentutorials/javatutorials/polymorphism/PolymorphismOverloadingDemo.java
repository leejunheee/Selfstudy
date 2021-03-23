package org.opentutorials.javatutorials.polymorphism;
class O {
	public void a(int param) {
		System.out.println("숫자출력");
		System.out.println(param);
	}
	public void a(String param) {
		System.out.println("문자출력");
		System.out.println(param);
		
	}
}

public class PolymorphismOverloadingDemo {

	public static void main(String[] args) {
		O o = new O();
		o.a(1); // 객체의 매개변수 인자로 1을 입력.
		o.a("one");
	}

}
