package day05;

import java.util.Random;
import java.util.Scanner;

public class ArrayQuiz3 {
	public static void main(String[] args) {
		
		// 1. 대문자 -> 소문자 출력, 소문자 -> 대문자 출력
		
		String letter;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("알파벳 입력 > ");
		letter = scan.next();
		
		if (letter.charAt(0)>=65 && letter.charAt(0)<=90) {
			System.out.println((char)(letter.charAt(0)+32));
		}
		else {
			System.out.println((char)(letter.charAt(0)-32));
		}
		
		System.out.println();
		
		// 2. 커피는 2000원이고 10개 이상 구매시 초과분은 1500원
		// 커피의 개수를 입력받고 총 가격을 출력
		
		System.out.println("구입할 커피 수 > ");
		int coffee = scan.nextInt();
		
		if (coffee<=10)
			System.out.println("총 가격 : "+(2000*coffee));
		else
			System.out.println("총 가격 : "+(1500*(coffee-10)+20000));
		
		System.out.println();
		
		// 3. 랜덤으로 알파벳 대문자 50개를 생성하여 출력
		// 출력은 10글자마다 줄바꿈
		
		Random rand = new Random();
		
		for (int i=0;i<5;i++) {
			for (int j=0;j<10;j++) {
				int Upperletter = rand.nextInt(25)+65;
				System.out.print((char)Upperletter);
			}
			System.out.println();
		}
		
		
	}
	
	

}
