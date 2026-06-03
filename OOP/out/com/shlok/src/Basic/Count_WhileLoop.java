package Basic;

public class Count_WhileLoop {
    public static void main(String[] args) {
        int input = 39573;
        int count = 0;
        int sum = 0;

        while (input != 0) {
            int digit = input % 10;
            count++;
            input /= 10;
            sum += digit;    
        }
        System.out.println("Total count is " + count);
        System.out.println("Total sum is " + sum);
    }
}
