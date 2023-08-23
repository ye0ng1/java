package day05;

import java.util.Arrays;

public class ArrayExample {
	public static void main(String[] args) {
		// �迭
		// ���� Ÿ���� ������ �ѹ��� ���� �� �����ϴ� ���

		// �迭�� ���� ���
		// 1. Ÿ��[] ������ = new Ÿ�Ը�[�迭�� ����];
		// 2. Ÿ��[] ������ = { ������ };
		// 3. Ÿ��[] ������ = new Ÿ�Ը�[] {������};

		int[] number = new int[10];
		boolean[] win = { true, false, false, false, true };
		String[] welcome = new String[] { "���� ������ �帮�� ���Դϴ�.", "����Ŀ�.", "�ȳ��ϼ���." };

		System.out.println(welcome[0]);
		System.out.println("welcome �迭�� ���� : " + welcome.length);

		// �迭�� ���� ���(Arrays.toString() �޼��� ���)
		System.out.println(Arrays.toString(number));
		System.out.println(Arrays.toString(win));
		System.out.println(Arrays.toString(welcome));

		// �迭�� ����� �ڵ������� �⺻������ �ʱ�ȭ
		// ���� : 0, �Ǽ� : 0.0, boolean : false, ������ : null
		String[] byeMessage = new String[10];
		System.out.println(Arrays.toString(byeMessage));

		// �迭�� ����
		// �迭�� ���� ����(swallow copy)�� ���� ����(deep copy)
		String[] byeMessage2 = new String[] { "good bye", "bye bye", "see you" };

		// swallow copy
		// byeMessage = byeMessage2;
		// byeMessage2[0] = "bye!";
		// System.out.println(Arrays.toString(byeMessage));

		// ���� ���� (deep copy)
		// System.arraycopy()
		System.arraycopy(byeMessage2, 0, byeMessage, 0, 3);
		System.out.println(Arrays.toString(byeMessage));
	}

}
