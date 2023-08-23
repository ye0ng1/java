package day03;

import java.util.Scanner;

public class quiz05 {
	public static void main(String[] args) {
		int num1, num2;
		Scanner in = new Scanner(System.in);
		
		System.out.println("정수 두개를 입력하세요");
		System.out.print(">");
		num1 = in.nextInt();
		System.out.print(">");
		num2 = in.nextInt();
		
		if (num1 > num2)
			System.out.println(num1+"이 큰 수입니다.");
		else if (num1 < num2)
			System.out.println(num2+"이 큰 수입니다.");
		else
			System.out.println("같은 수입니다.");
	}

}
