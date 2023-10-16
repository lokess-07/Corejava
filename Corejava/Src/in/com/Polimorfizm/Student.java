package in.com.Polimorfizm;
	//mrthod overloading
public class Student {// compiole time polimorfizm
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
