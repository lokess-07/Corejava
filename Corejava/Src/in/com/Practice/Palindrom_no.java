package in.com.Practice;

import java.util.Scanner;

public class Palindrom_no {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		int num = sc.nextInt();
		//121
		int b = 0;
		int c;
		int d = num;
		while(num>0) {
			c = num%10;
			b = b*10+c;
			num = num/10;
			
		}
		if (b==d) {
			System.out.println(d+"  this is palindrom no :");
			
		}else {
			System.out.println(d+" this is not palindrom no :");
		}
		sc.close();
	}
}
