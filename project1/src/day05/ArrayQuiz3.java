package day05;

import java.util.Random;
import java.util.Scanner;

public class ArrayQuiz3 {
	public static void main(String[] args) {
		
		// 1. �빮�� -> �ҹ��� ���, �ҹ��� -> �빮�� ���
		
		String letter;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���ĺ� �Է� > ");
		letter = scan.next();
		
		if (letter.charAt(0)>=65 && letter.charAt(0)<=90) {
			System.out.println((char)(letter.charAt(0)+32));
		}
		else {
			System.out.println((char)(letter.charAt(0)-32));
		}
		
		System.out.println();
		
		// 2. Ŀ�Ǵ� 2000���̰� 10�� �̻� ���Ž� �ʰ����� 1500��
		// Ŀ���� ������ �Է¹ް� �� ������ ���
		
		System.out.println("������ Ŀ�� �� > ");
		int coffee = scan.nextInt();
		
		if (coffee<=10)
			System.out.println("�� ���� : "+(2000*coffee));
		else
			System.out.println("�� ���� : "+(1500*(coffee-10)+20000));
		
		System.out.println();
		
		// 3. �������� ���ĺ� �빮�� 50���� �����Ͽ� ���
		// ����� 10���ڸ��� �ٹٲ�
		
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
