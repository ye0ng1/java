package day03;

public class quiz02 {
	public static void main(String[] args) {
		int randnum1 = (int)(Math.random()*100 + 1);
		System.out.println("��������: "+randnum1);
		System.out.println("3�� ������ ���: "+((randnum1%2==0) ? "¦��" : "Ȧ��"));
	}

}
