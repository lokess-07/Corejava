package in.com.Thread;

public class WithOut1 {
	 String name = null;
	public WithOut1(String name) {
		this.name = name;
		}
		public  void run() {
			for (int i = 1; i <= 5; i++) {
				System.out.println(name+" "+i);
				
			}
		}
	}

