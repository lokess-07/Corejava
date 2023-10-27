package in.com.Exception;

public class Throws1 {
	public static void main(String[] args) {
		
			m1();
			}
	public static void m1() {
	try {
		m3();
	} catch (Exception e) {
		System.out.println(e);
		}	
	}
	private static void m2() {
		m3();
	}
	private static void m3() {
		String name = "lokesh";
		char ch = name.charAt(7);
		System.out.println(ch);
	}
	
		
	}

