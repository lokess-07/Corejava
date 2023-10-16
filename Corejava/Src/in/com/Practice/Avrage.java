package in.com.Practice;

public class Avrage {

	public static void main(String[] args) {
		int count = 0;
		int sum=0;
		for (int i = 1; i <= 10; i++) {
			if(i%2==1) {
				sum= sum +i;
				count++;
			
			}
		}
			 int avg = sum/count;
			
			System.out.println(avg);
	}

	}


