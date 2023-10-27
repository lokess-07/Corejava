package in.com.Arraylist;

public class Student {
	int stdid;
	String name;
	int  age;
	
	public Student(int stdid,String name,int age) {
		this.name= name;
		this.age= age;
		this.stdid=stdid;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}

	public int getStdid() {
		return stdid;
	}

	public void setStdid(int stdid) {
		this.stdid = stdid;
	}

	public int getSection() {
		return age;
	}

	public void setSection(int section) {
	this.age = section;
}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student id = "+stdid+" Age = "+age+" name = "+name;
		
}
}

