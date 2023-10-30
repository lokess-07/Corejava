package in.com.Inheritance;

public class Main22 {
	public static void main(String[] args) {
		Shapess s = new Shapess();
		s.shapes();
		Triangle1 t = new Triangle1();
		t.setBase(5);
		t.setHeight(6);
		t.tarea();
	}
}
class Shapess {
	String color;
	int borderWidth;
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
	public int getBorderWidth() {
		return borderWidth;
		
	}
	public void shapes() {
		System.out.println("ye Shape ka area h ok");
	}
}
class Triangle1 extends Shapess{
	 int base;
	 int height;
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	 public void tarea() {
		double ta = (getBase()*getHeight())/2;
		System.out.println("Triangle are is :"+ta);
	 }
}