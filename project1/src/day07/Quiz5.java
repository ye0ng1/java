package day07;

public class Quiz5 {
	// 20¹ø
	
	
	static int primeNum(int a) {
		int num = 0;
		for (int i=2;i<=a;i++) {
			boolean iIsPrime = true;
			
			for (int j=2;j<i;j++) 
				if (i%j==0)
					iIsPrime = false;
			
			
			if (iIsPrime) 
				num++;
			
		}
		return num;
	}
	
	public static void main(String[] args) {
		System.out.println(primeNum(15));
	}

}
