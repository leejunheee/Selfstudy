package org.opentutorials.javatutorials.Inheritance.example1;

class Calculator {
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

class SubstractionableCalculator extends Calculator {
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

class 곱하기 extends Calculator {
	public void 곱() {
		System.out.println(this.left * this.right);
	}
}

public class CalculatorDemo1 {

	public static void main(String[] args) {
		
		
		SubstractionableCalculator c1 = new SubstractionableCalculator ();
		곱하기 c2 = new 곱하기 ();
		c1.setOprands(10,20);
		c1.sum();
		c1.avg();
		c1.substract();
		c2.setOprands(10,20);
		c2.곱();
		
		
	}

}
