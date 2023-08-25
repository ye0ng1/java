package day06;

import java.util.Scanner;

public class CustomerManage {
	
	// �迭�� ������ �� �ִ� �ִ� ���� ��
	static final int MAX = 100;
	
	// ���� ������ ������ ������ �迭�� ���� : �̸�, ����, �̸���, ����⵵
	static String[] nameList = new String[MAX];
	static String[] genderList = new String[MAX];
	static String[] emailList = new String[MAX];
	static int[] birthyearList = new int[MAX];
	
	// �迭�� �����ϱ� ���� �ε���
	static int index = -1; // ���� �ε����� -1
	
	// ���� �ڷ��� ����
	static int count = 0;
	
	// �Է� ��ġ�κ��� �Է°��� �ޱ� ����
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		while(true) {
			System.out.printf("%n[INFO] ���� �� : %d, �ε��� : %d%n", count, index);
			System.out.println("�޴��� �Է��ϼ���.");
			System.out.println("(I)nsert, (P)revious, (N)ext, (C)urrent, (U)pdate, (D)elete, (Q)uit");
			System.out.print("�޴� �Է� : ");
			String menu = scan.next();
			menu = menu.toLowerCase();
			// �޴� ���ý� ������ ����
			switch (menu.charAt(0)) {
			case 'i': // �Է�
				System.out.println("���� ���� �Է��� �����մϴ�.");
				if (count < MAX) {
					insertCustomerData();
					System.out.println("���� ������ �����Ͽ����ϴ�.");
				}
				else
					System.out.println("�� �̻� ������ �� �����ϴ�.");
				break;
			case 'p': // ����
				if(index<=0) {
					System.out.println("���� �����Ͱ� �������� �ʽ��ϴ�.");
				} else {
					System.out.println("���� �����͸� ����մϴ�.");
					index--;
					printCustomerData(index);
				}
				break;
			case 'n': // ����
				if(index>=count-1) {
					System.out.println("���� �����Ͱ� �������� �ʽ��ϴ�.");
				} else {
					System.out.println("���� �����͸� ����մϴ�.");
					index++;
					printCustomerData(index);
				}
				break;
			case 'c': // ����
				if((index > -1) && (index < count)) {
					System.out.println("���� �����͸� ����մϴ�.");
					printCustomerData(index);
				} else {
					System.out.println("�ε����� �ùٸ��� �ʽ��ϴ�.");
				}
				break;
			case 'u': // ����
				if((index > -1) && (index < count)) {
					System.out.println("�����͸� �����մϴ�.");
					updateCustomerData(index);
				} else {
					System.out.println("�ε����� �ùٸ��� �ʽ��ϴ�.");					
				}
				break;
			case 'd': // ����
				if((index > -1) && (index < count)) {
					System.out.println("�����͸� �����մϴ�.");
					deleteCustomerdata(index);
					index--;
				} else {
					System.out.println("�ε����� �ùٸ��� �ʽ��ϴ�.");
				}
				break;
			case 'q': // ����
				System.out.println("���α׷��� �����մϴ�.");
				scan.close();
				System.exit(0);
				break;
			default:
				System.out.println("�޴��� �߸� �Է��߽��ϴ�.");
			}
		}
	}
	
	public static void insertCustomerData() {
		System.out.print("�̸� : ");
		String name = scan.next();
		System.out.print("����(M/F) : ");
		String gender = scan.next();
		System.out.print("�̸��� : ");
		String email = scan.next();
		System.out.print("����⵵ : ");
		int birthYear = scan.nextInt();
		
		nameList[count] = name;
		genderList[count] = gender;
		emailList[count] = email;
		birthyearList[count] = birthYear;
		count++;
	}
	
	public static void printCustomerData(int index) {
		System.out.println("=============CUSTOMER INFO=============");
		System.out.println("�̸� : "+nameList[index]);
		System.out.println("���� : "+genderList[index]);
		System.out.println("�̸��� : "+emailList[index]);
		System.out.println("����⵵ : "+birthyearList[index]);
		System.out.println("=======================================");
	}
	
	public static void updateCustomerData(int index) {
		System.out.print("�̸� : ");
		String name = scan.next();
		System.out.print("����(M/F) : ");
		String gender = scan.next();
		System.out.print("�̸��� : ");
		String email = scan.next();
		System.out.print("����⵵ : ");
		int birthYear = scan.nextInt();
		
		nameList[index] = name;
		genderList[index] = gender;
		emailList[index] = email;
		birthyearList[index] = birthYear;
	}
	public static void deleteCustomerdata(int index) {
		while (index+1<count) {
			nameList[index] = nameList[index+1];
			genderList[index] = genderList[index+1];
			emailList[index] = emailList[index+1];
			birthyearList[index] = birthyearList[index+1];
			index++;
		}
		count--;
	}
	
}