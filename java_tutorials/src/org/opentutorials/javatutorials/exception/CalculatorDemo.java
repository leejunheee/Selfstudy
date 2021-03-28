package org.opentutorials.javatutorials.exception;
class Calculator {
	 int left, right;
	   int[] num = {0, 1,2,3};
	   public void setOprands(int left, int right) {
	      this.left = left;
	      this.right = right;
	}
	public void divide() {
		System.out.println(num[3] / num[0]);
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 0);
		c1.divide();
		
        Calculator c2 = new Calculator();
        c2.setOprands(10, 5);
        c2.divide();
	}

}
