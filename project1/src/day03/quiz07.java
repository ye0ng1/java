package day03;

import java.util.Scanner;

public class quiz07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("������ �޴���?");
		System.out.println("[����, ���, ���, ����, ��]");
		System.out.print("> ");
		String fruit = in.next();
		
		switch (fruit) {
		case "����":
			System.out.println(fruit+"�� ������ 2�����Դϴ�.");
			break;
		case "���":
			System.out.println(fruit+"�� ������ 3�����Դϴ�.");
			break;
		case "���":
			System.out.println(fruit+"�� ������ 4�����Դϴ�.");
			break;
		case "����":
			System.out.println(fruit+"�� ������ 5�����Դϴ�.");
			break;
		case "��":
			System.out.println(fruit+"�� ������ 6�����Դϴ�.");
		
		}
	}
}
