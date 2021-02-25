package org.opentutorials.javatutorials.scope;

public class ScopeDemo5 {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) { //i값은 for 문에 의해 선언.
			System.out.println(i); //중괄호 사이인 여기에서만 유효
		}
		//System.out.println(i); 중괄호 바깥 i는 존재하지 않는 변수
	}

}
