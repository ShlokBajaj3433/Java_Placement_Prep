package Basic.Recursion;

public class Digit {

    static int digit(int n) {
        if (n / 10 == 0) {
            return 1;
        }
        return 1 + digit(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(digit(01));    
    }
}