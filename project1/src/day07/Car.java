package day07;

public class Car {
	
	private String wheel;
	int numOfWheel;
	String brand;
	String name;

	Car() {
		wheel = "��ȣ";
		numOfWheel = 4;
		brand = "KIA";
		name = "K5";
	}
	
	Car(String wheel, int numOfWheel, String brand, String name) {
		//this : ���� �ν��Ͻ��� �ǹ���.
		
		//Ŭ���� ������ �Ű������� ���� �̸����� ����� ��, Ŭ���� ������ ��Ī�ϱ� ���ؼ� "this"�� �ٿ��� �Ѵ�.
		this.wheel = wheel;
	}
	
	public static void main(String[] args) {

		Car c = new Car();
		System.out.println(c.wheel);	
		c.wheel = "�̽���";
		System.out.println(c.wheel);
		
		Car c2 = new Car("�̽���", 6, "BMW", "Ƽ��");
		
	}
	
	
}
