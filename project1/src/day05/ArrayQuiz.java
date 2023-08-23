package day05;

import java.util.Random;

public class ArrayQuiz {
	public static void main(String[] args) {
		// 1. 1000개 짜리 int형 배열을 생성한 뒤 모든 값을 1 - 100 사이 랜덤 숫자로 채우기
		// 2. 1000개의 랜덤 숫자들 중 각 숫자가 몇번씩 나왔는지 세어 출력하기
		
		int[] numarray = new int[1000];
		int[] count = new int[100];
		Random rand = new Random();
		
		for (int i=0;i<1000;i++) {
			int num = rand.nextInt(100)+1;
			numarray[i] = num;
			count[num-1]++;
		}
		
		for (int i=0;i<100;i++) {
			if (count[i] != 0)
				System.out.println((i+1)+"의 갯수 : "+count[i]);
		}
	}

}
