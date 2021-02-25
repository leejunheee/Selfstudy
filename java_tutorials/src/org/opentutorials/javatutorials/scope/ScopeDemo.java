package org.opentutorials.javatutorials.scope;

public class ScopeDemo {
	
	static void a() {
		int i = 0; //i는 메소드안에서만 사용가능-유효범위
	}

	public static void main(String[] args) {
		for (int i = 0; i< 5; i++) {
			a();
			System.out.println(i);
		}
	}

}
