package in.com.List;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class List_to_even {

	public static void main(String[] args) {
		List<Integer>list = new ArrayList<Integer>();
		list.add(22);
		list.add(24);
		list.add(12);
		list.add(3);
		list.add(56);
		list.add(77);
		System.out.println(list);
		
		Stream<Integer>str=list.stream();
		List<Integer> newlist = str.filter(i-> i %2==0).collect(Collectors.toList());
		System.out.println(newlist);
	}

}
