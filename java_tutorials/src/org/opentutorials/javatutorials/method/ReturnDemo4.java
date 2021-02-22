package org.opentutorials.javatutorials.method;

public class ReturnDemo4 {

	public static String[] getMembers() { // getmembers 리턴값이 문자열을 담을수있는 배열
		String[] members = { "최진혁", "최유빈", "한이람" };
		return members;
	}

	public static void main(String[] args) {
		String[] members = getMembers();

	}

}
