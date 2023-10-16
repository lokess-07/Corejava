package in.com.Practice;

public class Rev_no {

	public static void main(String[] args) {
		int a = 1234;
		int b=0;
		int c ;
		
		while(a>0) {
			c=a%10;
			b=b*10+c;
			a=a/10;
		}
		System.out.println(b);

	}

}
