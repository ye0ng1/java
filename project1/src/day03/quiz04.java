package day03;
import java.util.Scanner;

public class quiz04 {
	public static void main(String[] args) {
		double height;
		int age;
		Scanner in = new Scanner(System.in);
		
		System.out.println("키와 나이를 입력하세요.");
		
		System.out.print("키: ");
		height = in.nextDouble();
		
		System.out.print("나이: ");
		age = in.nextInt();
		
		System.out.println("================");
		if (height >= 140 && age >= 8) {
			System.out.println("놀이기구 탑승이 가능합니다.");
		} else {
			System.out.println("놀이기구 탑승이 불가능합니다.");
		}
	}

}
