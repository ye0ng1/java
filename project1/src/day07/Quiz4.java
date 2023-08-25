package day07;

public class Quiz4 {
	// 19¹ø
	
	public static void main(String[] args) {
		System.out.println(sum(5));
		System.out.println(sum(12));
		
	}

	static int sum(int n) {
		int sum = 0;
		
		for (int i=1;i<=n;i++) {
			if (n%i==0) {
				sum += i;
			}
		}
		return sum;
	}
}