package org.opentutorials.javatutorials.object;

class Calculator{ //class를 통해 calculator라는 설계도를 컴퓨터에게 알려주는 역할
	int left, right;
	String l, r;
	
	public void setOprands (int left, int right) {
		this.left = left; // this라는 것은 int를 가르킴 , 인스턴스자신
		this.right = right; // this 는 
	}
	
	public void set (String l, String r) { 
		this.l = l;
		this.r = r;
	}
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
	
	public void test() {
		System.out.println(this.l + "" + this.r);
	}
}
public class CalculatorDemo4 {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator(); // c1에다가 새로운 객체를 담은것
		c1.setOprands(10,20); //연상의 대상에 대한 값
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator(); // 새로운 인스턴스를 생성해 c2에 담음
		c2.setOprands(20,40);
		c2.sum();
		c2.avg();
		
		Calculator c3 = new Calculator();
		c3.set("생활", "코딩");
		c3.test();
	}

}// class는 한번만 정의했지만 new라는 연산자를 통해 원하는 대로 변수에 인스터스를 담아 상태를 셋팅..
// 하나의 클래스 안에는 한종류의 데이터타입(int같은)만 가능한가? 