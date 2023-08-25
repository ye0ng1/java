package day07;

public class Car {
	
	private String wheel;
	int numOfWheel;
	String brand;
	String name;

	Car() {
		wheel = "금호";
		numOfWheel = 4;
		brand = "KIA";
		name = "K5";
	}
	
	Car(String wheel, int numOfWheel, String brand, String name) {
		//this : 현재 인스턴스를 의미함.
		
		//클래스 변수와 매개변수를 같은 이름으로 사용할 때, 클래스 변수를 지칭하기 위해서 "this"를 붙여야 한다.
		this.wheel = wheel;
	}
	
	public static void main(String[] args) {

		Car c = new Car();
		System.out.println(c.wheel);	
		c.wheel = "미쉐린";
		System.out.println(c.wheel);
		
		Car c2 = new Car("미쉐린", 6, "BMW", "티코");
		
	}
	
	
}
