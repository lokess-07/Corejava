package in.com.array;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n = sc.nextInt();
		boolean b = false;
		int[] num = {11,54,634,223,1234};
		for (int i = 0; i < num.length; i++)  
			if(num[i]==n) {
				b=true;
				break;
			}
		if(b) {
			System.out.println("yes your number is here");
		}
		else {
			System.out.println("no way!!!");
		}
				
	}
		
}
