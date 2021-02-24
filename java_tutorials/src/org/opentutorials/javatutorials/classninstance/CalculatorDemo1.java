package org.opentutorials.javatutorials.classninstance;

class Calculator {
	static double PI = 3.14;//static 뒤에 따라오는 변수= 클래스에 소속 = 모든 인스턴스에서 동일한값
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}

	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

public class CalculatorDemo1 {

	public static void main(String[] args) {

		Calculator c1 = new Calculator();
		System.out.println(c1.PI);

		Calculator c2 = new Calculator();
		System.out.println(c2.PI);

		System.out.println(Calculator.PI);
	}

}
