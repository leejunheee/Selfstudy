package org.opentutorials.javatutorials.finals;

class Calculator {
	static final double PI = 3.14; //모든 인스턴스에서 공통적으로(static) 바뀌지 않는 값.
	int left , right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
		//Calculator.PI = 6; 이미 PI의 값은 final로 3.14로 고정했기 때문에 변경 불가.
	}
	
	public void sum() {
		System.out.println(this.left + this.right );
	}
	
	public void avg() {
		System.out.println((this.left +this.right )/2);
	}
}

public class CalculatorDemo1 {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		System.out.println(c1.PI);
		//Calculator.PI=10; //final로 고정됐기때문에
	}

}
