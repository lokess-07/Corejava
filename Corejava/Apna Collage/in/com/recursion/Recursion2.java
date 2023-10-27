package in.com.recursion;

public class Recursion2 {
	
	public static void summ(int x ,int n, int sum) {
		if(x==n) {
			sum+=x;
			System.out.println(sum);
			return;
		}
		sum+=x;
		summ(x+1, n, sum);
	}

	public static void main(String[] args) {
		int x = 0;
		int n =5;
		int sum = 0;
		summ(x,n,sum);

	}

}
