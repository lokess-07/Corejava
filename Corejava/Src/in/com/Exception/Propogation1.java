package in.com.Exception;

public class Propogation1 {
	public static void main(String[] args) {
		a1();
		
	}
	private static void a1() {
		try {
			a2();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	private static void a2() {
		String name = "lokesh";
		System.out.println(name.charAt(7));	
	}
}
