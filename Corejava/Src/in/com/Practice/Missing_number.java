package in.com.Practice;

public class Missing_number {
 public static void main(String[] args) {
	int a [] = {2,6,4,8};
	int b [] = {2,6,8};
	int sum=0;
	int sum1=0;
	for (int i = 0; i < a.length; i++) {
		sum = sum +a[i];
	}
	for (int j = 0; j < b.length; j++) {
		sum1 = sum1+b[j];
	}
	System.out.println(sum-sum1);
	
}
}
