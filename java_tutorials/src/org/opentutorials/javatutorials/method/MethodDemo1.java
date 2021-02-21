package org.opentutorials.javatutorials.method;

public class MethodDemo1 { // 메소드의 정의 (뒤에 중괄호 나옴)

	public static void numbering() {
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
	}

	public static void main(String[] args) { // main 이 메소드
		numbering(); // 메소드의 호출 ( 괄호열고 닫음)
		numbering();
	}

}
