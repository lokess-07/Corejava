package in.comAbstract;

public class Testmachine {
public static void main(String[] args) {
	Machine m = new Machine();
	m.tractor();
	m.car();
	Parts p = new Parts() {

		@Override
		public void seats() {
			System.out.println("hello seats");
			
		}
		
	};
	p.seats();
	
}
}
