package in.com.Exception;

public class Default_exception2 {

	public static void main(String[] args) {
		
		doStuf();
		System.out.println("hii");

	}

	private static void doStuf() {
		doMoreStuf();
		System.out.println("hello");
	}

	private static void doMoreStuf() {
		String name = "abcd";
		System.out.println(name.charAt(7));
	}

}
