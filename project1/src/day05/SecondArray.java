package day05;

public class SecondArray {
	public static void main(String[] args) {
		// ������ �迭
		// 1���� �迭 : int�� ��ҷ� ���� �迭
		int[] number = {1,2,3,4,5};
		
		// �迭�� ��Ҵ� length - 1�� ����� ����
		System.out.println(number[number.length-1]);
		
		int[][] arr2 = {
				{3,3,3},
				{4,4,4},
				{5,5,5},
				number
		};
		
		System.out.println("1 : " + arr2[1][2]);
		System.out.println("2 : " + arr2[2][1]);
		System.out.println("3 : " + arr2[3][arr2.length-1]);
		
		for (int i=0;i<arr2.length;i++) {
			for (int j=0;j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]+" ");
			}
		}
	}

}
