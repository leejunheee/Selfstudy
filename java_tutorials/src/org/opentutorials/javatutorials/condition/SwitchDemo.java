package org.opentutorials.javatutorials.condition;

public class SwitchDemo {

	public static void main(String[] args) {

		System.out.println("switch(1)");
		switch (1) { // 숫자 = 조건, 스위치문 숫자와 케이스 숫자가 일치하면 실행
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");
		}
		// 케이스 1 뿐만 아니라 해당 로직 이후 모든 케이스들이 실행

		System.out.println("switch(2)");
		switch (2) {
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");
		}

		System.out.println("switch(3)");
		switch (3) {
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");
		}

		// break 실행

		System.out.println("switch(1)");
		switch (1) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		}

		System.out.println("switch(2)");
		switch (2) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		}

		System.out.println("switch(3)");
		switch (3) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		}

		int val = 1;
		if (val == 1) {
			System.out.println("one");
		} else if (val == 2) {
			System.out.println("two");
		} else if (val == 3) {
			System.out.println("three");
		} // 스위치문과 if 문은 대체가능

		// default 문 작성
		System.out.println("switch(1)");
		switch (1) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("default");
			/* 스위치문 안에 숫자에 없는 조건을 넣으면 디폴트정의가 실행 
			// switch 문을 사용할 때 한가지 주의 할 것은 switch의 
			//조건으로는 몇가지 제한된 데이터 타입만을 사용할 수 있다. 
			//byte, short, char, int, enum, String, Character, 
			 Byte, Short, Integer */
			

		}

	}
}
