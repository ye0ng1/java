package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		// 8��
		int num = 1;
		
		while (num<11) {
			System.out.println(num+"�� �л��� �⼮�� üũ�մϴ�.");
			num++;
		}
		
		System.out.println();
		
		// 9��
		int sum = 0;
		for (int i=1;i<=100;i++) {
			sum += (i%3==0) ? i : 0;
		}
		
		System.out.println("1~100���� 3�� ����� �� : "+sum+"\n");
		
		// 10��
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� > ");
		
		int size = scan.nextInt();
		int[] arr = new int[size];
		for (int i=0;i<size;i++) {
			arr[i]=i+1;
		}
		System.out.println("�迭 iarr��:"+Arrays.toString(arr));
		
	}

}
