package in.com.Arraylist;

import java.util.Comparator;
import java.util.stream.Collector;

public class Comparebyid  implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getStdid()-o2.getStdid();
	}
	
}
