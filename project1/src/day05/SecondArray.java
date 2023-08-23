package day05;

public class SecondArray {
	public static void main(String[] args) {
		// 다차원 배열
		// 1차원 배열 : int를 요소로 가진 배열
		int[] number = {1,2,3,4,5};
		
		// 배열의 요소는 length - 1번 방까지 있음
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
