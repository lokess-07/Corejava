package in.com.Arraylist1;

import java.util.*;

public class Iterator1 {
public static void main(String[] args) {
	Collection c = new ArrayList();
	c.add("Lokesh");
	c.add("Solanki");
	
	Iterator i = c.iterator();
	while(i.hasNext()) {
		Object o = i.next();
		System.out.println(o);
		}
	
	}
}
