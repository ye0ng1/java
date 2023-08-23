package day04;

public class WhileLoop {
	public static void main(String[] args) {
		int count = 0;
		
		while(true) {
			System.out.println(count+=10000);
			
			if (count < 0)
				break;
		}
	}

}
