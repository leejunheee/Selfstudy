package org.opentutorials.javatutorials.scope;

public class ScopeDemo2 {
	static int i; // 전역변수, 정적변수(어디에 속한게 아니라 클래스에 직속변수)
	// i를 메소드 밖, class의 영역에서 선언
	
	static void a() {
		i = 0; // i의 값을 1이 올라도 여기서 다시 0이 됨
	}//메소드 a의 i 값은 할당만 (선언안함)

	public static void main(String[] args) {
		for( i = 0; i<5; i++) {
			a();
			System.out.println(i);
		}
	}

}
//변수를 지정하는것은 변수의 유효범위를 정하는 행위