package day07;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		// 16-4��
		String[] friends = {"����", "�׿�", "����ġ", "���̾�", "�ܹ���"};
		Scanner scan = new Scanner(System.in);
		boolean exist = false;
		
		System.out.print("�˻��� īī��ģ��>");
		String friend = scan.nextLine();
		for (int i=0;i<5;i++) {
			if (friends[i].equals(friend)) {
				System.out.println(friend+" ģ���� "+i+"��°�� �ֽ��ϴ�.");
				exist = true;
				break;
			}
		}
		if (!exist)
			System.out.println(friend+"ģ���� �����ϴ�!");
	}

}
