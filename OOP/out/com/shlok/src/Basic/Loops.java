package Basic;

import java.util.Scanner;

public class Loops {

    private static void PrimeNumber() {

        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
    public static void main(String[] args) {
        // for (int i = 0; i < 5; i++) {
        //     System.out.println("Hello World");
        // }

        // int i = 0;
        // while (i < 5) {
        //     System.out.println("Hello World");
        //     i++;
        // }
 
        // int i = 0;
        // do {
        //     System.out.println("Hello World");
        //     i++;
        // } while (i < 5);

        // System.out.println("Enter a number to print its multiplication table: ");
        // Scanner scan = new Scanner(System.in);
        // double n = scan.nextDouble(); 
        // for (int i = 1; i <= 10; i++) {
        //    System.out.println(n + " x " + i + " = " + (n * i));
        // }

        System.out.println("Prime numbers between 1 and 100:");

        PrimeNumber();
    }
}
