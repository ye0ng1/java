package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		// 8번
		int num = 1;
		
		while (num<11) {
			System.out.println(num+"번 학생의 출석을 체크합니다.");
			num++;
		}
		
		System.out.println();
		
		// 9번
		int sum = 0;
		for (int i=1;i<=100;i++) {
			sum += (i%3==0) ? i : 0;
		}
		
		System.out.println("1~100까지 3의 배수의 합 : "+sum+"\n");
		
		// 10번
		Scanner scan = new Scanner(System.in);
		System.out.print("수를 입력하세요 > ");
		
		int size = scan.nextInt();
		int[] arr = new int[size];
		for (int i=0;i<size;i++) {
			arr[i]=i+1;
		}
		System.out.println("배열 iarr는:"+Arrays.toString(arr));
		
	}

}
