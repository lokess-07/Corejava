package in.com.Practice;

import java.util.Scanner;

public class Viwel_count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your value");
		String name = sc.next();
		int count = 0;
		
		String  name1=name.toLowerCase();
		
		for (int i = 0; i < name1.length(); i++) {
		char ch = name1.charAt(i);
		if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			count++;
		}
		}
		System.out.println(count);
	}

}
