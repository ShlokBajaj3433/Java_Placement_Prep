package Basic;

import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your marks: ");
        int sub1 = scan.nextInt();
        int sub2 = scan.nextInt();
        int sub3 = scan.nextInt();
        int sub4 = scan.nextInt();
        int sub5 = scan.nextInt();
        
        int totalMarks = sum(sub1, sub2, sub3, sub4, sub5);
        double percentage = calculatePercentage(sub1, sub2, sub3, sub4, sub5);
        displayResult(totalMarks, percentage);

    }

    private static int sum(int sub1, int sub2, int sub3, int sub4, int sub5) {
        return sub1 + sub2 + sub3 + sub4 + sub5;
    }

    public static double calculatePercentage(int sub1, int sub2, int sub3, int sub4, int sub5) {
        int totalMarks = sum(sub1, sub2, sub3, sub4, sub5);
        double percentage = (totalMarks / 500.0) * 100;
        return percentage;
    }

    public static void claculateGrade(double percentage) {
        if (percentage >= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 80) {
            System.out.println("Grade: B");
        } else if (percentage >= 70) {
            System.out.println("Grade: C");
        } else if (percentage >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }

    private static void displayResult(int totalMarks, double percentage) {
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        claculateGrade(percentage);
    }


}
