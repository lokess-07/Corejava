package in.com.Polimorfizm;

public class School {

	public static void main(String[] args) { 
		S1 s = new S2();
		s.sdetail();
	}

}
 class S1{
public void sdetail() {
	System.out.println("my name is lokesh");
}
 }
class S2 extends S1{
	public void sdetail() {
		//super.sdetail();
		System.out.println("my name is nikhil");
	}
}
