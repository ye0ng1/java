package day06;

public class ObjectBasic1 {
	public static void main(String[] args) {
		
		Calculator call = new Calculator();
		call.add(10);
		int result = call.result;
		Calculator cal2 = new Calculator();
		
		
		}
	
	
	
		static int result1 = 0;
		static int add1(int n) {
		result1 += n;
		return result1;
	}
}

/* <modifiers> class <className> {
 * 		ClassBody;
 *		//attributes - 멤버변수, 속성, 필드
 * 		//constructors - 생성자
 * 		//methods - 메서드, 행위, 기능
 * 	}
 * 
 * 속성 : 객체가 가지고 있는 명사적 특성
 * 생성자 : 클래스를 통해 객체를 생성하기 위해서 사용하는 것
 * 메서드 : 객체가 가지고 있는 동사적 특성
 * 
 * <modifiers> : 제한자로 public, protected, default(공백), private 등으로 접근 제한자 접근 레벨을 지정
 * public : 같은 패키지가 아니더라도 어느 클래스에서나 참조 가능
 * protected : 같은 패키지 내에서만 참조 가능, 자식 클래스는 다른 패키지에서도 참조 가능
 * default(공백) : 같은 패키치 내의 클래스에서만 참조 가능
 * private : 같은 클래스 내에서만 참조 가능
 */

class Calculator {
	int result = 0;
	int add(int n) {
		result += n;
		return result;
	}
}