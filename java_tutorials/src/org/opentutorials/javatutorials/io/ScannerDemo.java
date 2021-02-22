package org.opentutorials.javatutorials.io;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 사용자가 입력한 값을 알아내는 역할
		int i = sc.nextInt();
		System.out.println(i*1000);
		sc.close();
	}

}
