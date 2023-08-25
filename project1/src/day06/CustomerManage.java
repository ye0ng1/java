package day06;

import java.util.Scanner;

public class CustomerManage {
	
	// 배열에 저장할 수 있는 최대 고객 수
	static final int MAX = 100;
	
	// 고객 정보를 저장할 변수를 배열로 선언 : 이름, 성별, 이메일, 출생년도
	static String[] nameList = new String[MAX];
	static String[] genderList = new String[MAX];
	static String[] emailList = new String[MAX];
	static int[] birthyearList = new int[MAX];
	
	// 배열을 참조하기 위한 인덱스
	static int index = -1; // 최초 인덱스는 -1
	
	// 현재 자료의 개수
	static int count = 0;
	
	// 입력 장치로부터 입력값을 받기 위함
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		while(true) {
			System.out.printf("%n[INFO] 고객 수 : %d, 인덱스 : %d%n", count, index);
			System.out.println("메뉴를 입력하세요.");
			System.out.println("(I)nsert, (P)revious, (N)ext, (C)urrent, (U)pdate, (D)elete, (Q)uit");
			System.out.print("메뉴 입력 : ");
			String menu = scan.next();
			menu = menu.toLowerCase();
			// 메뉴 선택시 동작을 구현
			switch (menu.charAt(0)) {
			case 'i': // 입력
				System.out.println("고객 정보 입력을 시작합니다.");
				if (count < MAX) {
					insertCustomerData();
					System.out.println("고객 정보를 저장하였습니다.");
				}
				else
					System.out.println("더 이상 저장할 수 없습니다.");
				break;
			case 'p': // 이전
				if(index<=0) {
					System.out.println("이전 데이터가 존재하지 않습니다.");
				} else {
					System.out.println("이전 데이터를 출력합니다.");
					index--;
					printCustomerData(index);
				}
				break;
			case 'n': // 다음
				if(index>=count-1) {
					System.out.println("다음 데이터가 존재하지 않습니다.");
				} else {
					System.out.println("다음 데이터를 출력합니다.");
					index++;
					printCustomerData(index);
				}
				break;
			case 'c': // 현재
				if((index > -1) && (index < count)) {
					System.out.println("현재 데이터를 출력합니다.");
					printCustomerData(index);
				} else {
					System.out.println("인덱스가 올바르지 않습니다.");
				}
				break;
			case 'u': // 수정
				if((index > -1) && (index < count)) {
					System.out.println("데이터를 수정합니다.");
					updateCustomerData(index);
				} else {
					System.out.println("인덱스가 올바르지 않습니다.");					
				}
				break;
			case 'd': // 삭제
				if((index > -1) && (index < count)) {
					System.out.println("데이터를 삭제합니다.");
					deleteCustomerdata(index);
					index--;
				} else {
					System.out.println("인덱스가 올바르지 않습니다.");
				}
				break;
			case 'q': // 종료
				System.out.println("프로그램을 종료합니다.");
				scan.close();
				System.exit(0);
				break;
			default:
				System.out.println("메뉴를 잘못 입력했습니다.");
			}
		}
	}
	
	public static void insertCustomerData() {
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("성별(M/F) : ");
		String gender = scan.next();
		System.out.print("이메일 : ");
		String email = scan.next();
		System.out.print("출생년도 : ");
		int birthYear = scan.nextInt();
		
		nameList[count] = name;
		genderList[count] = gender;
		emailList[count] = email;
		birthyearList[count] = birthYear;
		count++;
	}
	
	public static void printCustomerData(int index) {
		System.out.println("=============CUSTOMER INFO=============");
		System.out.println("이름 : "+nameList[index]);
		System.out.println("성별 : "+genderList[index]);
		System.out.println("이메일 : "+emailList[index]);
		System.out.println("출생년도 : "+birthyearList[index]);
		System.out.println("=======================================");
	}
	
	public static void updateCustomerData(int index) {
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("성별(M/F) : ");
		String gender = scan.next();
		System.out.print("이메일 : ");
		String email = scan.next();
		System.out.print("출생년도 : ");
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
