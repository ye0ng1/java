package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		
		// 16-1��
		Scanner scan = new Scanner(System.in);
		String[] foods = new String[100];
		String food = "";
		int i = 0;
		
		System.out.println("# �԰� ���� ������ �Է��ϼ���!!");
		System.out.println("# �Է��� �����Ϸ��� <�׸�>�̶�� �Է��ϼ���.");
		
		while(true) {
			System.out.print("> ");
			food = scan.nextLine();
			if (food.equals("�׸�"))
				break;
			else {
				foods[i] = food;
				i++;
			}
		}
		
		String[] foodlist = new String[i];
		System.arraycopy(foods, 0, foodlist, 0, i);
		
		System.out.println("�Է� ����!!");
		System.out.println("���� �԰���� ���ĵ� : "+Arrays.toString(foodlist));
		
	}

}
