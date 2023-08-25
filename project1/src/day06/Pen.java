package day06;

public class Pen {
	// 클래스 안에 코드 작성
	// attribute(속성-멤버변수), constructors(생성자), methods(메서드)
	
	// 멤버 변수
	public String color; // 패키지 상관없이 불러올 수 있음 - public
	public int length;
	int price;			 // 같은 패키지 내에서 불러올 수 있음 - default
	
	/*
	 * 생성자는 반드시 클래스 안에 하나 이상 선언되어야 한다.
	 * 만약 선언하지 않으면 JVM(JAVA Virtual Machine)이 대신 기본 생성자를 자동으로 만듦
	 * 기본 생성자는 매개변수를 가지지 않은 형태로, 자동으로 만들어지는 경우 내용은 없음
	 * 
	 * 생성자를 만드는 규칙
	 * 생성자 이름은 클래스 이름과 대소문자까지 정확히 같아야 함
	 * 클래스 이름과 다른 이름으로 만들면 메서드 취급
	 */
	
	// 메서드
	public void write() {
		System.out.println("Hello world!");
	}
	
	public Pen () { // 기본 생성자
		color = "black";
		
	}
	
	
	public Pen(String init_color) {
		color = init_color;
		System.out.println("생성자를 이용하여 color, price 값 초기화");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
}
