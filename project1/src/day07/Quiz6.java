package day07;

public class Quiz6 {
	// 21��
	static int sumNum(int a, int b) {
		int small, big;
		int sum = 0;
		
		if (a>b) {
			big = a;
			small = b;
		} else {
			big = b;
			small = a;
		}
		
		for (;small<=big;small++) {
			sum += small;
		}
			
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("7~9�� ������ ���� �� : " + sumNum(7, 9));
		System.out.println("9~7�� ������ ���� �� : " + sumNum(9, 7));
		System.out.println("5~5�� ������ ���� �� : " + sumNum(5, 5));
		
	}
}
