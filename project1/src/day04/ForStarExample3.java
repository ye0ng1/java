package day04;

public class ForStarExample3 {
	public static void main(String[] args) {
		for (int i=0;i<9;i++) {
			for (int j=0;j<9;j++) {
				if (i+j<=3 || i+j>=13 || i>j+4 || j>i+4)
					System.out.print(" ");
				else if (j==4-i || j==12-i || j==i-4 || j==i+4)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
