package day07;

public class InstanceQuiz{
	public static void main(String[] args) {
		Moniter m = new Moniter();
	
		System.out.println("����� �⺻ �� : �ػ�-"+m.resolution+", ������-"+m.size+", ���-"+m.bright+", ����-"+m.power);
		m.turnPower();
		System.out.println(m.power);
		m.turnPower();
		System.out.println(m.power);
	}
}

class Moniter {

	/*
	 * ������ �����ϴ� ��ü�� Ŭ������ �����ϱ�
	 * 
	 * ����� Ŭ������ ����
	 * ����ʹ� �ػ�, ũ��, ���, ����(on/off) �Ӽ��� ����
	 * ����ʹ� �⺻������ �ػ�, ũ��, ��� ���� 100. ���´� off ���� ����
	 * ����ʹ� ��ư�� ������ �޼���, �� ���� on/off ����� ����
	 * �ش� �޼��� ����� ������ ���� �ִٸ� ������, ���� �ִٸ� ������ ��.
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
