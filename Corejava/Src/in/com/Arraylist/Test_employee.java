package in.com.Arraylist;

import java.util.ArrayList;

public class Test_employee {

	public static void main(String[] args) {
		Employee e1 = new Employee(11, "Lokesh", 21);
		Employee e2 = new Employee(13, "Nikhil", 23);
		
		ArrayList list = new ArrayList();
		list.add(e1);
		list.add(e2);
		System.out.println(list);
		}

}
