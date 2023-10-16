package in.com.Clonning;

public class Coustumer implements Cloneable{
	String name;
	Account ac3 = new Account();
	public Coustumer(String name ,int balance) {
		this.name= name;
		this.ac3.balance=balance;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Coustumer ct = (Coustumer) super.clone();
		ct.ac3=(Account)ac3.clone();
		return ct;
	}
	}
