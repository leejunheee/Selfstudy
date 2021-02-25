package org.opentutorials.javatutorials.scope;

public class ScopeDemo6 {
	static int i = 5;

	static void a() {
		int i = 10;
		b();
	}

	static void b() {
		System.out.println(i);
	}// 지역변수가 없다면 전역변수를 대신 사용한다.

	public static void main(String[] args) {
		a();

	}

}
