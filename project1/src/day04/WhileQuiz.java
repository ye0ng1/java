package day04;

public class WhileQuiz {
	public static void main(String[] args) {
		
		int j, i = 0;
	
		
		while (i<10) {
			j = 2;
			while (j<10) {
				if (i==0)
					System.out.print(j+"´Ü\t");
				else
					System.out.print(j+"x"+i+"="+(i*j)+"\t");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
