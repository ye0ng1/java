package day03;
import java.util.Scanner;

public class quiz03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���>");
		int num1 = in.nextInt();
		System.out.println("�Է¹��� ����: "+((num1%2==0) ? "¦��" : "Ȧ��"));
	}
}
