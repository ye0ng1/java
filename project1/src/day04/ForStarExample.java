package day04;

public class ForStarExample {
	public static void main(String[] args) {
		for (int i=0;i<5;i++) {
			for (int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n");
		
		for (int i=4;i>=0;i--) {
			for (int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

		System.out.println("\n");
		
		
		for(int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				if (i+j>=4)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
			
		System.out.println("\n");
				
		
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=5;j++) {
				if (j<i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
