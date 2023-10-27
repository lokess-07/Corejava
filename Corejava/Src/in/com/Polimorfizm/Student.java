package in.com.Polimorfizm;
	//method overloading
public class Student {// compile time polimorfizm
	public void book() {
		System.out.println("This is java book");
	}
	public void book(int price) {
		System.out.println("book price is :"+price);
	}
	public void book(String author) {
		System.out.println("book's author is :"+author);
		
	}
}
