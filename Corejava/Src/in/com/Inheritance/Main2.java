package in.com.Inheritance;

public class Main2 {
	public static void main(String[] args) {
		Shape[] s = new Shape[4];
		s[0]= new Circle();
		s[1]= new Triangle();
		s[2]= new Square();
		
		Circle c = (Circle)s[0];
		c.setRadius(6);
		c.acircle();
		
		Triangle t = (Triangle)s[1];
		t.setBase(7);
		t.setHight(12);
		t.atriangle();
		
		Square sq = (Square)s[2];
		sq.setLenght(44);
		sq.setWidth(22);
		sq.asquare();		
	}
}
  class Shape{
	  String color ;
	   int borderwidth;
	  
	  public void setColor(String color) {
		  this.color = color;
	  }
	  public String getColor() {
		  return color;
	  }
	  public void setBordrWidth(int borderwidth) {
		  this.borderwidth = borderwidth;  
	  }
	  public int getBorderWidth() {
		  return borderwidth;
	  }
	  public void dis() {
		  System.out.println("this is shape class");  
	  }
  }
  
  class Circle extends Shape{
	  public static final double pi = 3.1416;
	  private  int radius;
	  
	  public void setRadius(int radius) {
		  this.radius = radius; 
	  }
	  public  int getRadius() {
		  return radius;
	  }
	  
	  public void acircle() {
		  double ac = pi*(getRadius()*getRadius());
		  System.out.println("this is Area of circle :"+ac);
	  }
  }
  
  class Triangle extends Shape{
	 private int base;
	 private int hight;
	 
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHight() {
		return hight;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	public void atriangle() {
		double at = (getHight()*getBase())/2;
		System.out.println("Area of Triangle is :"+at);	
	}
  }
  
  class Square extends Shape{
	private  int lenght;
	private int width;

	public int getLenght() {
		return lenght;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void asquare() {
		double as = getLenght()*getWidth();
		System.out.println("area of square is :"+as);
	}
  }