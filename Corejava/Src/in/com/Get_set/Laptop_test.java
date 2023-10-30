package in.com.Get_set;

import java.util.Scanner;

public class Laptop_test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("laptop company is :");
		String company = sc.next();
		
		System.out.println("laptop color is :");
		String color = sc.next();
		 
		System.out.println("laptop price is :");
		int price = sc.nextInt();
		
		Laptop_1 l1 = new Laptop_1();
		l1.setCompany(company);
		l1.setColor(color);
		l1.setPrice(price);
		
		System.out.println(l1.getCompany());
		System.out.println(l1.color);
		System.out.println(l1.getPrice());
		sc.close();
	}

}
