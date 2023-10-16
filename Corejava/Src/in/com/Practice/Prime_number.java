package in.com.Practice;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = sc.nextInt();
		int count = 0;
		for (int i = 2; i < num; i++) {
			if(num%i==0) {
				count--;
			}
		}
			if(count==0) {
				System.out.println(num+": is prime number");
			}else 
				System.out.println(num+": is not a prime number");
			
		}

	
}
