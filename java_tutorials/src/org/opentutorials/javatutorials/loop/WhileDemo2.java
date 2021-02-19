package org.opentutorials.javatutorials.loop;

public class WhileDemo2 {

	public static void main(String[] args) {
		int i = 0;
		//i의 값이 10보다 작으면 ture, 크다면 false가 된다. 현재 i값은 0이기때문에 반복문 실행
		while(i<10) {
			System.out.println("Coding Evertday"+i);
			//i값에 1을 더한다. 반복문의 중괄호 마지막 라인에 도달하면 반복문은 반복문을 재호출.
			//이때 i<10의 값을 검사하게 된다.
			i++; // i++ 는 i = i + 1 로 표현가
		}
	}

}
