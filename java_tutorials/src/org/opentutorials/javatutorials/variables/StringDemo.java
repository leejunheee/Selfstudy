package org.opentutorials.javatutorials.variables;

public class StringDemo {

	public static void main(String[] args) {
		String a, b;
		a = "coding";
		b = "everybody";
		System.out.println(a + b);

		String first = "coding";
		System.out.println(first + " " + "everybody");

		int c = 10000;
		System.out.println(c + 10);
		System.out.println((c + 10) / 10);
		System.out.println(((c + 10) / 10) - 10);
		System.out.println((((c + 10) / 10) - 10) * 10);

		int d = c + 10;
		System.out.println(d / 10);
		
		int e = d / 10;
		System.out.println(e - 10);
	}

}