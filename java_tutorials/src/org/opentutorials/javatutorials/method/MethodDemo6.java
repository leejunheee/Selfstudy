package org.opentutorials.javatutorials.method;

public class MethodDemo6 {
	public static String numbering(int init, int limit) {// 넘버링이랑 메소드는 반드시 문자열

		int i = init;
		// 만들어지는 숫자들을 output이라는 변수에 담기위해 변수에 빈값을 주었다.
		String output = "";// 아무런 값 없는 빈문자열
		while (i < limit) {
			// 숫자를 화면에 출력하는 대신 변수 output에 담았다.
			output += i; // += 는 output = output + i 를 뜻함
			i++;
		}
		// 중요!!! output에 담겨 있는 문자열을 메소드 외부로 반환하려면 아래와 같이
		// return 키워드 뒤에 반환하려는 값을 배치하면 된다.
		return output; // 무조건 return에서 종료하고 뒤에오는 값을 출력값으로 반환
	}

	public static void main(String[] args) {
		// 메소드 numbering이 리턴한 값이 변수 result에 담긴다.
		String result = numbering(1, 5);
		// 변수 result의 값을 화면에 출력한다.
		System.out.println(result);
	}

}
