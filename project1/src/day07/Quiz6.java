package day07;

public class Quiz6 {
	// 21번
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
		System.out.println("7~9의 사이의 수의 합 : " + sumNum(7, 9));
		System.out.println("9~7의 사이의 수의 합 : " + sumNum(9, 7));
		System.out.println("5~5의 사이의 수의 합 : " + sumNum(5, 5));
		
	}
}
