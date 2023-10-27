package in.com.Practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	
		
		int a = 1;
		System.out.println("enter your number ");
		Scanner  s = new Scanner (System.in);
		int c = s.nextInt();
		for (int i = 1; i <= c; i++) {
			a=a*i;
		}
		System.out.println(a);
		s.close();
	}
}
