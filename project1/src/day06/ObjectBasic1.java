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
 *		//attributes - �������, �Ӽ�, �ʵ�
 * 		//constructors - ������
 * 		//methods - �޼���, ����, ���
 * 	}
 * 
 * �Ӽ� : ��ü�� ������ �ִ� ����� Ư��
 * ������ : Ŭ������ ���� ��ü�� �����ϱ� ���ؼ� ����ϴ� ��
 * �޼��� : ��ü�� ������ �ִ� ������ Ư��
 * 
 * <modifiers> : �����ڷ� public, protected, default(����), private ������ ���� ������ ���� ������ ����
 * public : ���� ��Ű���� �ƴϴ��� ��� Ŭ���������� ���� ����
 * protected : ���� ��Ű�� �������� ���� ����, �ڽ� Ŭ������ �ٸ� ��Ű�������� ���� ����
 * default(����) : ���� ��Űġ ���� Ŭ���������� ���� ����
 * private : ���� Ŭ���� �������� ���� ����
 */

class Calculator {
	int result = 0;
	int add(int n) {
		result += n;
		return result;
	}
}