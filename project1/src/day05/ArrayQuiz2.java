package day05;

public class ArrayQuiz2 {
	
	public static void main(String[] args) {

		// numArr�� ������ ���հ� ����� ���ؼ� ����Ͻÿ�.
		int[][] numArr = {
				{5, 5, 5, 5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20},
				{30, 30, 30}
		};
		
		int sum = 0;
		
		for (int i=0;i<numArr.length;i++) {
			for (int j=0;j<numArr[i].length;j++) {
				sum += numArr[i][j];
			}
		}
		
		System.out.println("���� : "+sum);
	}
}
