package Basic.Recursion;

public class Exponential {
    static int exp(int n,int p){
        if (p == 1) {
            return n;
        }
        return n * exp(n, p-1); 
    }
    public static void main(String[] args) {
        
        
        System.out.println(exp(4, 4));
    }
}
