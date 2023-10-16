package in.com.Get_set;

public class Test_Overloading {
	public static void main(String[] args) {
		Overloading o = new  Overloading(2000);
		Overloading o1= new  Overloading("jertiuyitru");
		Overloading o2 = new  Overloading('x');
		System.out.println(o.a);
		System.out.println(o1.b);
		System.out.println(o2.c);
	}

}
