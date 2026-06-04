package Basic.Recursion;

public class Sum {

    static int sum(int n){
        if (n == 1) {
            return 1;
        }
        return n + (n-1);
    }

    public static void main(String[] args) {
        
        int n = 10;
        int result = sum(n);
        System.out.println(result);
    }
}
