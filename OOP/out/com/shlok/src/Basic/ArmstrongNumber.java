package Basic;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int input = 153;
        int count = String.valueOf(input).length(); 
        int sum = 0;
        int ans = input; 
        while (input != 0) {
            int digit = input % 10;
            sum += Math.powExact(digit, count);
            input = input / 10;

        }

        if (sum == ans ) {
            System.out.println("Is an amstrom number: ");
        }

        
    }
}
