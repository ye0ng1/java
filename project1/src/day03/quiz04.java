package day03;
import java.util.Scanner;

public class quiz04 {
	public static void main(String[] args) {
		double height;
		int age;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ű�� ���̸� �Է��ϼ���.");
		
		System.out.print("Ű: ");
		height = in.nextDouble();
		
		System.out.print("����: ");
		age = in.nextInt();
		
		System.out.println("================");
		if (height >= 140 && age >= 8) {
			System.out.println("���̱ⱸ ž���� �����մϴ�.");
		} else {
			System.out.println("���̱ⱸ ž���� �Ұ����մϴ�.");
		}
	}

}
