package org.opentutorials.javatutorials.overloading.example1;

class Calculator {
	int left, right;
	int third = 0;//전역변수
	
	public void setOprands (int left, int right) {//매개변수가 2개인 메소드
		System.out.println("setOprands(int left, int right)");
		this.left = left;
		this.right = right;
	}
	
	public void setOprands(int left, int right, int third) {
		this.setOprands(left, right);//중복 제거
		System.out.println("setOprands(int left, int right, int third)");
		this.third = third;
	}//매개변수가 3개인 메소드를 오버로딩
	
	
	public void sum() {
		System.out.println(this.left + this.right + this.third);
	}
	
	public void avg() {
		System.out.println((this.left+this.right+this.third)/3);
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator ();
		c1.setOprands(10,20);
		c1.sum();
		c1.avg();
		c1.setOprands(10,20,30);
		c1.sum();
		c1.avg();
	}

}
