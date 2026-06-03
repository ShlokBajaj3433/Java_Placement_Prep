package Basic;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        int ammount = 1501000;
        double intrestRate = 6.35;
        int years ;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of years (1-5): ");
        years = scan.nextInt();
        
        double simpleIntrest = (ammount * intrestRate * years) / 100;
        double totalAmmount = ammount + simpleIntrest;

        switch (years) {

            case 1:
                System.out.println("Simple Interest for 1 year: " + simpleIntrest);
                System.out.println("Total Ammount after 1 year: " + totalAmmount);
                break;
            case 2:
                System.out.println("Simple Interest for 2 years: " + simpleIntrest);
                System.out.println("Total Ammount after 2 years: " + totalAmmount);
                break;
            case 3:
                System.out.println("Simple Interest for 3 years: " + simpleIntrest);
                System.out.println("Total Ammount after 3 years: " + totalAmmount);
                break;
            case 4:
                System.out.println("Simple Interest for 4 years: " + simpleIntrest);
                System.out.println("Total Ammount after 4 years: " + totalAmmount);
                break;
            case 5:
                System.out.println("Simple Interest for 5 years: " + simpleIntrest);
                System.out.println("Total Ammount after 5 years: " + totalAmmount); 
                break;
            default:
                System.out.println("Invalid number of years");
                break;
        }
        
    }
}
