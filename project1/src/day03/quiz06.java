package day03;

import java.util.Scanner;

public class quiz06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		
		System.out.println("정수를 입력하세요.");
		System.out.print("> ");
		num = in.nextInt();
		
		if (num < 0)
			System.out.println(num+"은(는) 음의 정수입니다.");
		else if (num == 0)
			System.out.println("입력한 정수는 0입니다.");
		else if (num % 2 == 0)
			System.out.println(num+"은(는) 짝수입니다.");
		else
			System.out.println(num+"은(는) 홀수입니다.");
	}

}
