package day03;
import java.util.Scanner;

public class quiz03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("정수를 입력하세요>");
		int num1 = in.nextInt();
		System.out.println("입력받은 수는: "+((num1%2==0) ? "짝수" : "홀수"));
	}
}
