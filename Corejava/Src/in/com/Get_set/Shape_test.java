package in.com.Get_set;

import java.util.Scanner;

public class Shape_test {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Shapes color");
	String color = sc.next();
	
	System.out.println("Enter Shapes width");
	int width = sc.nextInt();
	
	System.out.println("Enter shapes price");
	int price=sc.nextInt();
	
	Shapes s1 = new Shapes();
	s1.setColor(color);
	s1.setWidht(width);
	s1.setprice(price);
	System.out.println("Shape color is : "+s1.getColor());
	System.out.println("Shpe width is :"+s1.getwidht());
	System.out.println("Shape price is :"+s1.getprice());
}
}
