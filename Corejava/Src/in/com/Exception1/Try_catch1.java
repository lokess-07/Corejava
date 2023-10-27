package in.com.Exception1;

public class Try_catch1 {
	public static void main(String[] args) {
		int a = 11;
		int b = 0;
		String name = "asdfg";
		try {
			System.out.println(a/b);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		try {
			System.out.println(name.charAt(7));
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally{
			System.out.println("Finally block");
		}
		
	}
}

