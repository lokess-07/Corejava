package in.com.Exception;



public class Try_catch {
    public static void main(String[] args) {
        try {
        	int i = 15;
        int j = 0;
        String name = "lokesh";
        
        
        	//System.out.println(name.charAt(9));
            int k = i/j;
            System.out.println(k);
            
        }
        catch (Exception e) {
        	System.out.println(e);
            
        }
        finally {
			System.out.println("this will alwes work, no matter ");
		}
    
    }
}

