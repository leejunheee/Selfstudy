package org.opentutorials.javatutorials.condtionaloperator;

public class LoginDemo3 {

	public static void main(String[] args) {
		String id = args[0];
		String password = args[1];
		if (id.equals("egoing") && password.equals("111111")) {
			System.out.println("right");
		} else {
			System.out.println("wrong");
		}
			
	}

}

/* 
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
*/ 
// 위 두개는 완전같은 동작