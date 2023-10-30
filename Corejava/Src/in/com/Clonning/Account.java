package in.com.Clonning;

 public class Account implements Cloneable{
	
		int balance ;

		@Override
		protected Object clone() throws CloneNotSupportedException {
		return super.clone();
		}
	    
}
 



