package in.com.Clonning2;

public class Coaching implements Cloneable {
	String name;
	Collage clg = new Collage();
	public Coaching(String name,int fees) {
		this.name = name;
		this.clg.fees= fees;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Coaching ch = (Coaching) super.clone();
		ch.clg = (Collage) clg.clone();
		return ch;
	}
}
