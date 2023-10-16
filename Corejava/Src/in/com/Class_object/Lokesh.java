package in.com.Class_object;

class Ls {
	String sn = "Solanki";
	int age ;
	
	public Ls(int age){
		//System.out.println(age);
		this.age = age;
	}
}
public class Lokesh{
	public static void main(String[] args) {
		Ls k = new Ls(22);
		System.out.println(k.age);
	}
	
}