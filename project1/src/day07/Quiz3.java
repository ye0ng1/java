package day07;

public class Quiz3 {
	// 18��
	
	public static void main(String[] args) {
		String str = java(5);
		System.out.println(str);
		str = java(9);
		System.out.println(str);
		
	}
	
	static 	String java(int len) {
		String str = "";
		for (int i=0;i<len;i++) {
			str += (i%2==0) ? "��" : "��";
		}
		return str;
	}

}
