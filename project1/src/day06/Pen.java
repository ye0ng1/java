package day06;

public class Pen {
	// Ŭ���� �ȿ� �ڵ� �ۼ�
	// attribute(�Ӽ�-�������), constructors(������), methods(�޼���)
	
	// ��� ����
	public String color; // ��Ű�� ������� �ҷ��� �� ���� - public
	public int length;
	int price;			 // ���� ��Ű�� ������ �ҷ��� �� ���� - default
	
	/*
	 * �����ڴ� �ݵ�� Ŭ���� �ȿ� �ϳ� �̻� ����Ǿ�� �Ѵ�.
	 * ���� �������� ������ JVM(JAVA Virtual Machine)�� ��� �⺻ �����ڸ� �ڵ����� ����
	 * �⺻ �����ڴ� �Ű������� ������ ���� ���·�, �ڵ����� ��������� ��� ������ ����
	 * 
	 * �����ڸ� ����� ��Ģ
	 * ������ �̸��� Ŭ���� �̸��� ��ҹ��ڱ��� ��Ȯ�� ���ƾ� ��
	 * Ŭ���� �̸��� �ٸ� �̸����� ����� �޼��� ���
	 */
	
	// �޼���
	public void write() {
		System.out.println("Hello world!");
	}
	
	public Pen () { // �⺻ ������
		color = "black";
		
	}
	
	
	public Pen(String init_color) {
		color = init_color;
		System.out.println("�����ڸ� �̿��Ͽ� color, price �� �ʱ�ȭ");
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
