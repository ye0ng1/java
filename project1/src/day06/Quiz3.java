package day06;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		// 16-2,3��
		Scanner scan = new Scanner(System.in);
		String[] friends = new String[100];
		int i = 0;		
		
		while(true) {
			System.out.print("�Է��� īī��ģ��>");
			String friend = scan.nextLine();
			for (int j=0;j<i;j++) {
				if (friends[j].equals(friend)) {
					System.out.println("�̹� �Էµ� ģ���Դϴ�.");
					break;
				}
					
			}
			if (friend.equals("�׸�"))
				break;
			else {
				System.out.println(friend+"�Է� ����!");
				friends[i] = friend;
				i++;
			}
		}
		
		System.out.println(i+"���� īī�� ģ���� �Է� �Ǿ����ϴ�.");
		
	}
}
