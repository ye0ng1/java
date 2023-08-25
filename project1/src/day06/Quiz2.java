package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		
		// 16-1번
		Scanner scan = new Scanner(System.in);
		String[] foods = new String[100];
		String food = "";
		int i = 0;
		
		System.out.println("# 먹고 싶은 음식을 입력하세요!!");
		System.out.println("# 입력을 중지하려면 <그만>이라고 입력하세요.");
		
		while(true) {
			System.out.print("> ");
			food = scan.nextLine();
			if (food.equals("그만"))
				break;
			else {
				foods[i] = food;
				i++;
			}
		}
		
		String[] foodlist = new String[i];
		System.arraycopy(foods, 0, foodlist, 0, i);
		
		System.out.println("입력 종료!!");
		System.out.println("내가 먹고싶은 음식들 : "+Arrays.toString(foodlist));
		
	}

}
