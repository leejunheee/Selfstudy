package org.opentutorials.javatutorials.constant;

public class Explicconversion {

	public static void main(String[] args) {
		float a = (float)100.0;
		int b = (int)100.132F; 
		
		System.out.println(b);  // int타입 정수형을 가지기때문에 소숫점 아래는 손실
	}

}
