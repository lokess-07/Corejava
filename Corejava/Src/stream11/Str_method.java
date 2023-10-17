package stream11;

import java.util.List;
import java.util.stream.Collectors;

public class Str_method {

	public static void main(String[] args) {
		List<String>num1 = List.of("Lokesh","Lokesh","Solanki","Solanki");
		List<String>newnum1 = num1.stream().distinct().collect(Collectors.toList());
		System.out.println(newnum1);
		
		List<String>num2 =num1.stream().filter(i->i.startsWith("L")).collect(Collectors.toList());
		System.out.println(num2);
		
		
		List<Integer>num3 = List.of(1,3,5,6,6,6);
		List<Integer>newnum3 = num3.stream().distinct().collect(Collectors.toList());
		System.out.println(newnum3);
	}

}
