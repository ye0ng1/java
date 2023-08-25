package day07;

public class InstanceQuiz{
	public static void main(String[] args) {
		Moniter m = new Moniter();
	
		System.out.println("모니터 기본 값 : 해상도-"+m.resolution+", 사이즈-"+m.size+", 밝기-"+m.bright+", 전원-"+m.power);
		m.turnPower();
		System.out.println(m.power);
		m.turnPower();
		System.out.println(m.power);
	}
}

class Moniter {

	/*
	 * 다음에 설명하는 객체의 클래스를 생성하기
	 * 
	 * 모니터 클래스를 생성
	 * 모니터는 해상도, 크기, 밝기, 상태(on/off) 속성을 가짐
	 * 모니터는 기본적으로 해상도, 크기, 밝기 값을 100. 상태는 off 값을 가짐
	 * 모니터는 버튼을 누르는 메서드, 즉 전원 on/off 기능이 존재
	 * 해당 메서드 실행시 전원이 켜져 있다면 꺼지고, 꺼져 있다면 켜져야 함.
	 */
	
	int resolution;
	int size;
	int bright;
	boolean power;
	
	Moniter() {
		resolution = 100;
		size = 100;
		bright = 100;
		power = false;
	}
	
	public void turnPower() {
		power = !power;
	}	
}
