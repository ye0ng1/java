package day03;

import java.util.Scanner;

public class quiz05 {
	public static void main(String[] args) {
		int num1, num2;
		Scanner in = new Scanner(System.in);
		
		System.out.println("���� �ΰ��� �Է��ϼ���");
		System.out.print(">");
		num1 = in.nextInt();
		System.out.print(">");
		num2 = in.nextInt();
		
		if (num1 > num2)
			System.out.println(num1+"�� ū ���Դϴ�.");
		else if (num1 < num2)
			System.out.println(num2+"�� ū ���Դϴ�.");
		else
			System.out.println("���� ���Դϴ�.");
	}

}
