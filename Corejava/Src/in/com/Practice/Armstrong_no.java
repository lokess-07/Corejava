package in.com.Practice;

import java.util.Scanner;

public class Armstrong_no {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		
		int a = sc.nextInt();
		int b = 0;
		int c;
		int d = a;
		 while (d>0) {
			 c = d%10;
			 b = b+(c*c*c);
			 d = d/10;
		 }
		 if (b == a) {
			 System.out.println("this is Amstrong number");
		 }
		 else {
			 System.out.println("this is not Amstrong number");
		 }
			 	 
	 }
		
}

