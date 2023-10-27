package in.com.Exception1;

public class Propogation1 {
	public static void main(String[] args) {
		a1();
		
	}
	private static void a1() {
		try {
			a3();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	private static void a2() {
		a3();	
	}
	private static void a3() {
		String name = "lokesh";
		System.out.println(name.charAt(7));	
	}
}
