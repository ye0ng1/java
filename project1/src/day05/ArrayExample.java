package day05;

import java.util.Arrays;

public class ArrayExample {
	public static void main(String[] args) {
		// 배열
		// 같은 타입의 변수를 한번에 여러 개 선언하는 방법

		// 배열의 선언 방법
		// 1. 타입[] 변수명 = new 타입명[배열의 길이];
		// 2. 타입[] 변수명 = { 데이터 };
		// 3. 타입[] 변수명 = new 타입명[] {데이터};

		int[] number = new int[10];
		boolean[] win = { true, false, false, false, true };
		String[] welcome = new String[] { "오늘 날씨는 흐리고 비입니다.", "배고파요.", "안녕하세요." };

		System.out.println(welcome[0]);
		System.out.println("welcome 배열의 길이 : " + welcome.length);

		// 배열의 내용 출력(Arrays.toString() 메서드 사용)
		System.out.println(Arrays.toString(number));
		System.out.println(Arrays.toString(win));
		System.out.println(Arrays.toString(welcome));

		// 배열은 선언시 자동적으로 기본값으로 초기화
		// 정수 : 0, 실수 : 0.0, boolean : false, 참조형 : null
		String[] byeMessage = new String[10];
		System.out.println(Arrays.toString(byeMessage));

		// 배열의 복사
		// 배열의 얕은 복사(swallow copy)와 깊은 복사(deep copy)
		String[] byeMessage2 = new String[] { "good bye", "bye bye", "see you" };

		// swallow copy
		// byeMessage = byeMessage2;
		// byeMessage2[0] = "bye!";
		// System.out.println(Arrays.toString(byeMessage));

		// 깊은 복사 (deep copy)
		// System.arraycopy()
		System.arraycopy(byeMessage2, 0, byeMessage, 0, 3);
		System.out.println(Arrays.toString(byeMessage));
	}

}
