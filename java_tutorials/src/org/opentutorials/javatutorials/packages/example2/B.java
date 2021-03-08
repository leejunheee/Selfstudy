package org.opentutorials.javatutorials.packages.example2;
import org.opentutorials.javatutorials.packages.example1.A;
//example1 안에 있는 A라는 클래스만 로드, 모든걸 불러올땐 example1.* 사용

public class B {

	public static void main(String[] args) {
		A a = new A();
	}

}
