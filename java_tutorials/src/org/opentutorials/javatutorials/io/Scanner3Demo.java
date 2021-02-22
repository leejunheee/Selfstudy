package org.opentutorials.javatutorials.io;

import java.util.Scanner;
import java.io.*;

public class Scanner3Demo {

	public static void main(String[] args) {
		try { //예외 
			File file = new File("out.txt");
			Scanner sc = new Scanner(file);
		    while(sc.hasNextInt()) {
		    	System.out.println(sc.nextInt()*1000);
		    }
		    sc.close();
		} catch(FileNotFoundException e) { //예외 - out.txt 파일 찾을수없을경우 에러내용 화면출력
			e.printStackTrace();
		}
	}

}
