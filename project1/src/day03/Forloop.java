package day03;

public class Forloop {
	public static void main(String[] args) {
		
		int sum = 0;
		int subsum = 0;
		
		for (int i=100;i>=1;i--) {
			System.out.print(i+" ");
		}
		
		System.out.println("\n\n");
		
		for (int i=1;i<=200;i++) {
			if (i%2!=0 && i%3!=0)
				sum += i;
		}
		
		System.out.println("합계: "+sum+"\n\n");
		
		sum = 0;
		
		for (int i=1;i<=10;i++) {
			if (i!=1)
				System.out.print("(");
			
			
			for (int j=1;j<=i;j++) {
				sum += j;
				System.out.print(j);
				
				if(i!=j)
					System.out.print("+");
			}
			
			if (i!=1)
				System.out.print(")");
			
			if (i!=10)
				System.out.print(" + ");
			
		}
		
		System.out.println("\n\n합계: "+sum);
	}
}