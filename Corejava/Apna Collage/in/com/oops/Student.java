package in.com.oops;
class Lokesh{
	String name ;
	int age;
	void info() {
		System.out.println("my name is "+name);
		System.out.println("my age is "+age);
	}
}
public class Student {
	public static void main(String[] args) {
		Lokesh ls = new Lokesh();
		ls.age=21;
		ls.name="Lokesh Solanki";
		ls.info();
	}
}
