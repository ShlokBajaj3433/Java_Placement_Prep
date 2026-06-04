package Projects;

import java.util.Scanner;

public class Billing {
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Billing bill = new Billing();
        int amount = bill.Menu();

        System.out.println("Enter the distance for delivery in kilometers: ");
        double distance = bill.scan.nextDouble();
        int deliveryCharge = bill.deliveryCharge(amount, distance);

        System.out.println("Do you have a coupon code for discount? (Y / N ): ");
        char hasCoupon = bill.scan.next().charAt(0);
        if (hasCoupon == 'Y' || hasCoupon == 'y') {
            System.out.println("Enter the coupon code: ");
            String code_input = bill.scan.next();
            int discount = bill.couponCode(amount, code_input);
            amount -= discount;
        } else {
            System.out.println("No coupon code applied.");            
        }

        int gst = bill.GST(amount);
        int totalAmount = bill.totalAmount(amount, gst, deliveryCharge);
        System.out.println("Total amount to be paid: " + totalAmount);
    }

    int Menu(){
        int choice = 0;
        System.out.println("Select the menu item you want to order:");
        System.out.println("1. Pizza - amount: 500");
        System.out.println("2. Burger - amount: 200");
        System.out.println("3. Pasta - amount: 300");
        choice = scan.nextInt();
        int amount = 0;
        switch (choice) {
            case 1:
                System.out.println("You have selected pizza.");
                
                amount = 300;
                break;
            case 2:
                System.out.println("You have selected burger.");
                amount = 200;
                break;
            case 3:
                System.out.println("You have selected pasta.");
                amount = 100;
                break;
            default:
                System.out.println("Invalid selection. Please select a valid menu item.");
        }
        return amount;
    }

    int deliveryCharge(int amount, double distance){
        int Total = 0;
        if(distance < 10){
            amount += 50;
        } else if(distance >= 10 && distance < 20){
            amount += 100;
        } else {
            amount += 150;
        }

        return Total;
    }

    int couponCode(int amount, String code_input){
        int discount = 0;
        if (code_input.equals("10OFF")) {
            discount = (int) (amount * 0.1);
        } else if (code_input.equals("20OFF")) {
            discount = (int) (amount * 0.2);
        } else if (code_input.equals("30OFF")) {
            discount = (int) (amount * 0.3);
        } else {
            System.out.println("Invalid coupon code. No discount applied.");
        }
        return discount;
    }

    int GST(int amount){
        int gst = (int) (amount * 0.18);
        return gst;
    }

    int totalAmount(int amount, int gst, int deliveryCharge){
        int FinalAmount = amount + gst + deliveryCharge;
        return FinalAmount;
    }
        

}
