package in.com.Clonning2;

public class Study {

	public static void main(String[] args) throws CloneNotSupportedException {
		Coaching coh = new Coaching("Rays",90000);
		Coaching coh1 = (Coaching) coh.clone();
		coh1.name="Lnct";
		coh1.clg.fees=40000;
		
		System.out.println(coh.name);
		System.out.println(coh.clg.fees);
		System.out.println();
		System.out.println(coh1.name);
		System.out.println(coh1.clg.fees);
		

	}

}
