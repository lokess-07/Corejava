package in.com.oop_test;

public class Student1 {
	public void read(String book) {
		System.out.println("I am reading "+book+ " book");
	}
	public void code() {
		System.out.println("and write code");
	}
}
class Lokesh extends Student1{
	String name ;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	void info1() {
		System.out.println("Name : "+getName());
	}
}
class Amit extends Student1{
	String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	void info1() {
		System.out.println("Name : "+getName());

	}
}
