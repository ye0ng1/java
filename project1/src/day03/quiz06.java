package day03;

import java.util.Scanner;

public class quiz06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		
		System.out.println("������ �Է��ϼ���.");
		System.out.print("> ");
		num = in.nextInt();
		
		if (num < 0)
			System.out.println(num+"��(��) ���� �����Դϴ�.");
		else if (num == 0)
			System.out.println("�Է��� ������ 0�Դϴ�.");
		else if (num % 2 == 0)
			System.out.println(num+"��(��) ¦���Դϴ�.");
		else
			System.out.println(num+"��(��) Ȧ���Դϴ�.");
	}

}
