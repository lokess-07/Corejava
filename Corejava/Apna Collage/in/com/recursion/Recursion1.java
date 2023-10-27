package in.com.recursion;



public class Recursion1 {
    public static void printnum(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        printnum(n - 1);
        return;
    }

    public static void main(String[] args) {
        int n = 6;
        printnum(n);
    }
}

