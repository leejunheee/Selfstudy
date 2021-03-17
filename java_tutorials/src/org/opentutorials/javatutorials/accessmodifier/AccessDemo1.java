package org.opentutorials.javatutorials.accessmodifier;

class A {
	public String y() {
		return "public void y()";
	}
	private String z() { //클래스 내부에선 사용가능하지만 외부클래스(AccessDemo1)에선 사용불가.
		return "public void z()";
	}
	public String x() {
		return z();
	}
}

public class AccessDemo1 {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.y());
		// 아래 코드는 오류가 발생.
		//System.out.println(a.z());
		//메소드 키워드가 private로 시작. 
		System.out.println(a.x()); //같은 클래스 내에선 private를 사용가능
	}

}
// public, private 이 부분이 접근제어자.