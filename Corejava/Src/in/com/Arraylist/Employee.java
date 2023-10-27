package in.com.Arraylist;

public class Employee {
	private int id = 0;
	private int age  = 0;
	private String name= null;
	
	public Employee(int id,String name,int age) {
		this.id = id;
		this.age= age;
		this.name= name;
	}
	
		
		public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


		@Override
	public String toString() {
		return id +" "+name+" "+age;
	}
}
