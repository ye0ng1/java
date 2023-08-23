package day03;

import java.util.Scanner;

public class quiz07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("구입할 메뉴는?");
		System.out.println("[수박, 사과, 멜론, 포도, 귤]");
		System.out.print("> ");
		String fruit = in.next();
		
		switch (fruit) {
		case "수박":
			System.out.println(fruit+"의 가격은 2만원입니다.");
			break;
		case "사과":
			System.out.println(fruit+"의 가격은 3만원입니다.");
			break;
		case "멜론":
			System.out.println(fruit+"의 가격은 4만원입니다.");
			break;
		case "포도":
			System.out.println(fruit+"의 가격은 5만원입니다.");
			break;
		case "귤":
			System.out.println(fruit+"의 가격은 6만원입니다.");
		
		}
	}
}
