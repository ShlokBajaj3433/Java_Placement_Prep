package Basic;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("How many Fibonacci series :");
        int n = scan.nextInt();
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + ", ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
