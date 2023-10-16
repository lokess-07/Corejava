package in.com.Practice2;

import java.util.Scanner;

public class While_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter your name :");
		String name = "";
		while (name.isBlank()) {
			
			System.out.print("Enter yourr name :");
			name = sc.nextLine();
			
		}
		System.out.println("hello :"+name);

	}

}
