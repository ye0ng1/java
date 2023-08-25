package day07;

public class Quiz2 {
	// 17¹ø
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		
		method1();
		method2("Hello");
		method3(1, 100, 10000);
		method4(30);
		method5("Hi", 3);
		maxNum(12, 633);
		abs(-5);
		method6(6);
		method7(arr);
		method8("hi", "hello");
	}

	static void method1() {
		System.out.println("¾È³ç");
	}
	
	static String method2(String str) {
		return str;
	}
	
	static double method3(int a, int b, double c) {
		return a+b+c;
	}
	
	static String method4(int i) {
		if (i%2==0)
			return "Â¦¼ö";
		else
			return "È¦¼ö";
	}
	
	static void method5(String str, int i) {
		for (int j=0;j<i;j++)
			System.out.println(str);
	}
	
	static double maxNum(double a, double b) {
		if (a>b)
			return a;
		else
			return b;
	}
	
	static int abs(int i) {
		if (i>0)
			return i;
		else
			return -i;		
	}
	
	static int method6(int i) {
		int sum = 0;
		for (int j=0;j<=i;j++) {
			sum += j;
		}
		return sum;
	}
	
	static int method7(int[] arr) {
		return arr.length;
	}
	
	static String[] method8(String str1, String str2) {
		String[] strs = {str1, str2};
		return strs;
	}
}
