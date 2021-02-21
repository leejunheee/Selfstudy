package org.opentutorials.javatutorials.method;

public class MethodDemo4 {
	public static void numbering(int limit) { // 리미트라는 변수는 정수만 받을수있다고 정의
		int i = 0;
		while (i < limit) {
			System.out.println(i);
			i++;
		} // 넘버링이라는 메소드는 고정값임 - 더이상 손댈필요 없다
	}

	public static void main(String[] args) {
		numbering(5); // 5를 입력 -> 리미트가 숫자 5로 정해짐 , 가변적

	}

}
 //int limit 는 매개변수 
// 매개변수에 주는 값을 '인자', argument
