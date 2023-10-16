package in.com.Clonning;

public abstract class Test_ac_co {

	public static void main(String[] args) throws CloneNotSupportedException {
		Coustumer ac = new Coustumer("Sbi",400);
		Coustumer ac1 = (Coustumer) ac.clone();
		ac1.name = "Kiosk";
		ac1.ac3.balance= 111;
		System.out.println(ac.name);
		System.out.println(ac.ac3.balance);
		System.out.println(ac1.name);
		System.out.println(ac1.ac3.balance);
	}
}
