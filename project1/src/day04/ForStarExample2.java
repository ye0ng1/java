package day04;

public class ForStarExample2 {
	public static void main(String[] args) {
		for (int i=0;i<5;i++) {
			for (int j=0;j<9;j++) {
				if (j>=4-i && j<=4+i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		
		System.out.println("\n");
		
		for (int i=0;i<5;i++) {
			for (int j=0;j<9;j++) {
				if (j>=i && j<=8-i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
