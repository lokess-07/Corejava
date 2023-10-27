package in.com.itrator;
import java.util.*;

public class Iterator1 {
		int id;
		int age;
		String name;
		
		public Iterator1(int id,int age,String name) {
			this.id=id;
			this.age= age;
			this.name=name;
		}
	@Override
	public String toString() {
	// TODO Auto-generated method stub
	return id+" "+age+" "+name;
	}

		public static void main(String[] args) {
			Iterator1 i1 = new Iterator1(1,22,"Deepak");
			Iterator1 i2 = new Iterator1(2,21,"Lokesh");
			Iterator1 i3 = new Iterator1(3,23,"Nikhil");
			
			ArrayList<Iterator1> x = new ArrayList<Iterator1>();
			x.add(i1);
			x.add(i2);
			x.add(i3);
			
		//	Iterator<Iterator1> it = x.iterator();
			
			for (Object o:x) {
				System.out.println(o);
			}
			//while(it.hasNext()) {
			//	System.out.println(it.next());
		//}	
	}
}