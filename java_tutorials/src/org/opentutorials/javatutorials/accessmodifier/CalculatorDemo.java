package org.opentutorials.javatutorials.accessmodifier;

class Calculator {
	private int left, right; // 이 두개의 변수는 외부에서 호출될 필요가 없기때문에 외부로부터 숨기기 위해 접근제어자로 private을 지정.
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	private int _sum() {
		return this.left+this.right;
	}
	public void sumDecoPlus() {
		System.out.println("++++"+_sum()+"++++");
	}
	public void sumDecoMinus() {
		System.out.println("----"+_sum()+"----");
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator() ;
		c1.setOprands(10,20);
		c1.sumDecoPlus();
		c1.sumDecoMinus();
	}

}
