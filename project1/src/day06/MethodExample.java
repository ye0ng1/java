package day06;

import java.util.Scanner;

public class MethodExample {
	// return
	// return���� �޼��� ������ ������ ��� ���� ȣ��� �κп� ��ȯ�ϴ� ����
	// return���� �ܵ����� ������� ���� ȣ��� ������ ��� �Ѿ
	// ������ return �ڿ� ����İ� �Բ� ���Ǹ� ���� ��� ���� ��� �Բ� �Ѿ
	
	// �޼���(Method)
	// �޼���� �ݺ��Ǵ� �ڵ� ��Ͽ� �̸��� �ٿ� ���� ��
	// �޼���� �ݺ��Ǵ� �ڵ带 �ٿ��ְ�, ���� ����ȭ�� �ڵ带 ���� �ڵ带 �˾ƺ��� ���� ��
	// ��ü���� ���α׷��ֿ��� �޼���� '��ü�� �������� ����� �����ϱ� ���ؼ� �����'�� ǥ����
	// �޼��� �̸� �ڿ��� �ݵ�� '()' (�Ұ�ȣ)�� ����
	
	/*
	 * �޼��� ���� (���� ���)
	 * <��ȯ ����> <�޼��� �ĺ��� -�̸�>(�Ű� ����) {
	 *     ��� ��;
	 * }
	 * 
	 * �޼��� ����, �Ű�����
	 * �Ű������� �ְ�/����, ��ȯ���� �ִ�/����
	 * 
	 */
	
	
	public static void main(String[] args) {
		print();
		int num1 = input();
		int num2 = input();
		
		int result = add(num1, num2);
		showResult(result);
	}
	
	static void print() {
		System.out.println("���� �ΰ� �Է��ϼ���!");
	}
	
	static int input() {
		Scanner scan = new Scanner(System.in);
		
		return scan.nextInt();
	}
	
	static int add(int num1, int num2) {
		return num1+num2;
	}
	
	static void showResult(int result) {
		System.out.println("��� : "+result);
	}
}

