package com.shlok.Basic;

import java.util.Scanner;

public class IffElse {
    public static void main(String[] args) {
        int bankBalance = 5000;
        int withdrawAmount;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw: ");
        withdrawAmount = scan.nextInt();
        
        if (withdrawAmount <= 0) {
            System.out.println("Error: Amount must be greater than 0.");
        } else if (withdrawAmount % 100 != 0) {
            System.out.println("Error: Amount must be a multiple of 100.");
        } else if (withdrawAmount <= bankBalance) {
            if (withdrawAmount > 10000) {
                System.out.println("Warning: Large withdrawal amount detected.");
                bankBalance -= withdrawAmount;
                System.out.println("Withdrawal successful. Remaining balance: " + bankBalance);
            } else {
                bankBalance -= withdrawAmount;
                System.out.println("Withdrawal successful. Remaining balance: " + bankBalance);
            }
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }


}
