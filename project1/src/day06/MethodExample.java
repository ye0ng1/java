package day06;

import java.util.Scanner;

public class MethodExample {
	// return
	// return문은 메서드 실행을 끝내고 결과 값을 호출된 부분에 반환하는 문장
	// return문만 단독으로 사용했을 때는 호출된 곳으로 제어만 넘어감
	// 하지만 return 뒤에 연산식과 함께 사용되면 식의 결과 값과 제어가 함께 넘어감
	
	// 메서드(Method)
	// 메서드는 반복되는 코드 블록에 이름을 붙여 놓은 것
	// 메서드는 반복되는 코드를 줄여주고, 좀더 구조화된 코드를 만들어서 코드를 알아보기 쉽게 함
	// 객체지향 프로그래밍에서 메서드는 '객체가 가져야할 기능을 구현하기 위해서 만든다'고 표현함
	// 메서드 이름 뒤에는 반드시 '()' (소괄호)가 따름
	
	/*
	 * 메서드 형식 (선언 방법)
	 * <반환 유형> <메서드 식별자 -이름>(매개 변수) {
	 *     기능 상세;
	 * }
	 * 
	 * 메서드 구분, 매개변수
	 * 매개변수가 있고/없고, 반환값이 있다/없다
	 * 
	 */
	
	
	public static void main(String[] args) {
		print();
		int num1 = input();
		int num2 = input();
		
		int result = add(num1, num2);
		showResult(result);
	}
	
	static void print() {
		System.out.println("정수 두개 입력하세요!");
	}
	
	static int input() {
		Scanner scan = new Scanner(System.in);
		
		return scan.nextInt();
	}
	
	static int add(int num1, int num2) {
		return num1+num2;
	}
	
	static void showResult(int result) {
		System.out.println("결과 : "+result);
	}
}

