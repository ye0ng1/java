package day04;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Random;
import java.util.Iterator;

public class LoopQuiz {
	public static void main(String[] args) {
		
		boolean isPrime;
		
		for (int i=2;i<=100;i++) {
			isPrime = true;
			for (int j=2;j<i;j++) {
				if (i%j==0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				System.out.print(i+"  ");
			}
		}
		
		System.out.println("\n");
		
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next();
		for (int i=word.length()-1;i>=0;i--) {
			System.out.print(word.charAt(i));
		}
		
		System.out.println("\n");
		
		Random random = new Random();
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		while (set.size()<6) {
			int num = random.nextInt(45)+1;
			set.add(num);
		}
		
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
	}

}
