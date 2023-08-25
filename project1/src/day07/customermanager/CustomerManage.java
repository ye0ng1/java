package day07.customermanager;

import java.util.Scanner;

import day07.customermanager.oop.Customer;

public class CustomerManage {
	
	// �迭�� ������ �� �ִ� �ִ� �� ��
	static final int MAX = 100;
	
	static Customer[] cusList = new Customer[MAX];
	
	// �迭�� �����ϱ� ���� �ε���
	static int index = -1; // ���� �ε����� -1
	
	// ���� �ڷ��� ����
	static int count = 0;
	
	// �Է� ��ġ�κ��� �Է°��� �ޱ� ����
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		while(true) {
			System.out.printf("%n[INFO] �� �� : %d, �ε��� : %d%n", count, index);
			System.out.println("�޴��� �Է��ϼ���.");
			System.out.println("(I)nsert, (P)revious, (N)ext, (C)urrent, (U)pdate, (D)elete, (Q)uit");
			System.out.print("�޴� �Է� : ");
			String menu = scan.next();
			menu = menu.toLowerCase();
			// �޴� ���ý� ������ ����
			switch (menu.charAt(0)) {
			case 'i': // �Է�
				System.out.println("�� ���� �Է��� �����մϴ�.");
				if (count < MAX) {
					insertCustomerData();
					System.out.println("�� ������ �����Ͽ����ϴ�.");
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
		
		Customer c = new Customer(name, gender, email, birthYear);
		cusList[count] = c;
		count++;
	}
	
	public static void printCustomerData(int index) {
		System.out.println("=============CUSTOMER INFO=============");
		System.out.println(cusList[index].toString());
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
		int birthyear = scan.nextInt();
		
		cusList[index].setName(name);
		cusList[index].setGender(gender);
		cusList[index].setEmail(email);
		cusList[index].setBirthyear(birthyear);
	}
	public static void deleteCustomerdata(int index) {
		while (index+1<count) {
			cusList[index] = cusList[index+1];
			index++;
		}
		count--;
	}
}
