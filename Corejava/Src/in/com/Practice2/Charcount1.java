package in.com.Practice2;

public class Charcount1 {
    public static void main(String[] args) {
        String name = "malyalam";
        
        for (int i = 0; i < name.length(); i++) {
            char currentChar = name.charAt(i);
            int count = 0;
            
            for (int j = 0; j < name.length(); j++) {
                if (name.charAt(j) == currentChar) {
                    count++;
                }
            }
            
            System.out.println("'" + currentChar + "' occurs " + count + " times");
        }
    }
}
