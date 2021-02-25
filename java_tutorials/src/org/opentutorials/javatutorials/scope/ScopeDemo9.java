package org.opentutorials.javatutorials.scope;

class C3 {
	int v = 10;
	
	void m() {
		int v = 20;
		System.out.println(v);
		System.out.println(this.v); //this 가 붙으면 객체에 대한 전역의 의미
	}
}

public class ScopeDemo9 {

	public static void main(String[] args) {
		C3 c1 = new C3();
		c1.m();
	}

}
