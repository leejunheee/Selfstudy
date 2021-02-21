package org.opentutorials.javatutorials.array;

public class LengthDemo {

	public static void main(String[] args) {
		// String[] classGroup = { "최진혁", "최유빈", "한이람", "이고잉" };
		String[] classGroup = new String[4]; // 배열에 담을 수를 넣어줌
		classGroup[0] = "최진혁";
		System.out.println(classGroup.length);
		classGroup[1] = "최유빈";
		System.out.println(classGroup.length);
		classGroup[2] = "한이람";
		System.out.println(classGroup.length);
		classGroup[3] = "이고잉";
		System.out.println(classGroup.length);

	} //length = 클래스 그룹 원소의 갯수 = string 뒤에들어오는 숫자

}
