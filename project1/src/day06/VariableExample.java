package day06;

public class VariableExample {
	public static void main(String[] args) {
		Variable var = new Variable();
		var.printNum(2);
	}

}

/*
 * ��� ���� (Member Variable)
 * Ŭ���� �ȿ��� ����� ����
 * ��ü�� ������ �� �� ������Ÿ���� �⺻������ �ڵ� �ʱ�ȭ
 * �⺻�� : ������ 0, �ε��Ҽ����� 0.0, ���� false, ��ü null
 * 
 * 
 * �������� (Local Variable)
 * Automatic variable
 * �޼��� �ȿ��� ����� ����
 * ����ϱ� ���� �ݵ�� �ʱ�ȭ �ؾ� ��
 * 
 * 
 */

class Variable {
	int a; //��� ����
	public void printNum(int c) { //�Ű����� c
		int b = 1; // ���������� �ݵ�� �ʱ�ȭ �ؾ� ��
		System.out.println("��� ���� : "+a);
		System.out.println("���� ���� : "+b);
		System.out.println("�Ű� ���� : "+c);
	}
}