package in.com.Polimorfizm;
	//method overloading , compile time
public class Car {
	public void run () {
		System.out.println("car is running ");
	}
	public void run(int cspeed) {
		System.out.println("Car's speed is :"+cspeed);
	}
	public void run(String cname ) {
		System.out.println("car's name is"+cname);
	}
	public void stop() {
		System.out.println("car is stopped");
	}
}
	
