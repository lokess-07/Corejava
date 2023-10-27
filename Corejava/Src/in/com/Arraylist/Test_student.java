package in.com.Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Test_student {
	
	public static void main(String[] args) {
	ArrayList<Student>s1=new ArrayList<Student>();
	
	s1.add(new Student(4, "Deepak", 22));
	s1.add(new Student(2, "Vinay", 20));
	s1.add(new Student (7, "Lokesh", 21));
	
	System.out.println(s1);
	Collections.sort(s1,new Compare_byid_std());	
	System.out.println(s1);
	}
}

