package in.com.Practice2;

class Clonning2  implements Cloneable{
	int age;
	String name;
	public   Clonning2(int age ,String name) {
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return ""+age+" "+name;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
public class Clonning1{
	public static void main(String[] args) throws CloneNotSupportedException {
		
	
	Clonning2 c = new Clonning2(33,"Lokesh");
	Clonning2 c1 = (Clonning2) c.clone();
	c.age= 21;
	c.name= "solanki";
	
	System.out.println(c1);
	System.out.println(c);
	
	}
}