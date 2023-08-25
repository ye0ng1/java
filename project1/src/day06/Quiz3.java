package day06;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		// 16-2,3번
		Scanner scan = new Scanner(System.in);
		String[] friends = new String[100];
		int i = 0;		
		
		while(true) {
			System.out.print("입력할 카카오친구>");
			String friend = scan.nextLine();
			for (int j=0;j<i;j++) {
				if (friends[j].equals(friend)) {
					System.out.println("이미 입력된 친구입니다.");
					break;
				}
					
			}
			if (friend.equals("그만"))
				break;
			else {
				System.out.println(friend+"입력 성공!");
				friends[i] = friend;
				i++;
			}
		}
		
		System.out.println(i+"명의 카카오 친구가 입력 되었습니다.");
		
	}
}
