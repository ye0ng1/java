package day06;

public class PenInstanceExample {
	public static void main(String[] args) {
		// ������ PenŬ������ ��ü ���� ��
		
		// ��ü ���� ���
		// ClassName instanceName = new Constructor();
		Pen redPen = new Pen("red");
		redPen.color = "red";
		System.out.println(redPen);
		System.out.println(redPen.color);
		
		redPen.write();
		
		
	}

}
