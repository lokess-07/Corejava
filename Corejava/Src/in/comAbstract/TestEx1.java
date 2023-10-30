package in.comAbstract;

 abstract class Example1 {
	public abstract void name();
}
public class TestEx1{
	public static void main(String[] args) {
		Example1 e1 = new Example1() {

			@Override
			public void name() {
				System.out.println("ok");
				
			}
			
		};
		e1.name();
	}
}
