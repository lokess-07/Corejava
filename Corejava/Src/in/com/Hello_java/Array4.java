package in.com.Hello_java;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] phy= {66,45,36,22,49};
		double avg = 0;
		
		for (int i = 0; i < phy.length; i++) {
			avg= avg+phy[i];
		}
		System.out.println(avg/phy.length);
		
	}

}
