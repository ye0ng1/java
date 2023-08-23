package day05;

public class VaribleLifetime {
	
	int b = 15;
	
	public static void main(String[] args) {
		
		int b = 5;
		System.out.println("main method¿« b : "+b);
		
		VaribleLifetime obj = new VaribleLifetime();
		System.out.println("class¿« b : "+obj.b);
		
		if(true) {
			int a = 10;
			System.out.println(b);
			a = 7;
		}
		
		for (int i=0;i<10;i++) {}
		int i =10;
	
	}

}
