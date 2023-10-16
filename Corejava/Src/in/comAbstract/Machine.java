package in.comAbstract;
 class Machine{
	public void tractor() {
		System.out.println("This is my tractor");
	}
 
	public void car() {
		System.out.println("This is my car");
	}
	
}
abstract class Parts extends Machine{
	public abstract void seats();
	
}