package day05;

import java.util.Random;

public class ArrayQuiz {
	public static void main(String[] args) {
		// 1. 1000�� ¥�� int�� �迭�� ������ �� ��� ���� 1 - 100 ���� ���� ���ڷ� ä���
		// 2. 1000���� ���� ���ڵ� �� �� ���ڰ� ����� ���Դ��� ���� ����ϱ�
		
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
				System.out.println((i+1)+"�� ���� : "+count[i]);
		}
	}

}
