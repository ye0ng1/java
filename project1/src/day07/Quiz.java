package day07;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		// 16-4번
		String[] friends = {"무지", "네오", "어피치", "라이언", "단무지"};
		Scanner scan = new Scanner(System.in);
		boolean exist = false;
		
		System.out.print("검색할 카카오친구>");
		String friend = scan.nextLine();
		for (int i=0;i<5;i++) {
			if (friends[i].equals(friend)) {
				System.out.println(friend+" 친구는 "+i+"번째에 있습니다.");
				exist = true;
				break;
			}
		}
		if (!exist)
			System.out.println(friend+"친구는 없습니다!");
	}

}
