package org.opentutorials.javatutorials.packages.example3;
import org.opentutorials.javatutorials.packages.example1.*;
import org.opentutorials.javatutorials.packages.example2.*;
 
public class D {
    public static void main(String[] args) {
       // B b = new B(); ---- example1,2 에서 동시에 B가 로드되있어서 에러
    	org.opentutorials.javatutorials.packages.example2.B b = new org.opentutorials.javatutorials.packages.example2.B();
    	 
    }
} 