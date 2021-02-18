package org.opentutorials.javatutorials.condition;

public class LoginDemo2 {

	public static void main(String[] args) {
		String id = args[0]; // egoing = args[0]
	    String password = args[1]; // 111111 = args[1]
		if (id.equals("egoing")) {
			if (password.equals("111111")) {
				System.out.println("right");
			} else {
				System.out.println("wrong");

			}

		} else {
			System.out.println("wrong");
		}
	}

}
// if 문 안에 또다른 if 문을 만들어 더 어려운 조건문 생성 가능