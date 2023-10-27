package in.com.Thread;

public class Test_Without1 {
	public static void main(String[] args) {
		WithOut1 w1 = new WithOut1("I AM");
		WithOut1 w2 = new WithOut1("The Boss");
		w1.run();
		w2.run();
	}
}
