package in.com.Arraylist1;
import java.util.*;
public interface Arraylist1 {
	public static void main(String[] args) {
	ArrayList x1 = new ArrayList<>();
	ArrayList y2 = new ArrayList<>();
	y2.add(443);
	y2.add(754);
	y2.add(554);
	
	x1.add(2);
	x1.add(3);
	x1.add(33);
	x1.add(54);
	x1.add(14);
	x1.add(7);
	x1.addAll(y2);
	
	for (int i = 0; i < x1.size(); i++) {
		System.out.println(x1.get(i));
	}
	
}
}