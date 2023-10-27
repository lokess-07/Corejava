package in.com.Arraylist;

import java.util.ArrayList;

public class Test_employee {

	public static void main(String[] args) {
		Employee e1 = new Employee(11, "Lokesh", 21);
		Employee e2 = new Employee(13, "Nikhil", 22);
		System.out.println(e1+" "+e2);
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		System.out.println(list);
		}
}
