package day03;

public class quiz02 {
	public static void main(String[] args) {
		int randnum1 = (int)(Math.random()*100 + 1);
		System.out.println("·£´ý¼ö´Â: "+randnum1);
		System.out.println("3Ç× ¿¬»êÀÇ °á°ú: "+((randnum1%2==0) ? "Â¦¼ö" : "È¦¼ö"));
	}

}
