package com.shlok.Basic.String;

import java.util.Scanner;

public class EmployeeData {
    public static void main(String[] args) {
        String str = new String("Shlok Bajaj, Pankaj sharma, virat Kohli, Aman Singh");

        String[] names = str.toLowerCase().split(",");
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name u want to Search");
        String search = sc.nextLine().toLowerCase();

        // Search by first or last name (safe checks for single-word names)
        boolean found = false;
        for (String name : names) {
            String trimmed = name.trim().toLowerCase();
            String[] parts = trimmed.split("\\s+");

            boolean match = parts.length > 0 && parts[0].equals(search);
            if (!match && parts.length > 1) {
                match = parts[1].equals(search);
            }

            if (match) {
                System.out.println(name.trim());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employee found with that name.");
        }

        // Employees Count
        System.out.println("Employees Count");
        int count = names.length;
        System.out.println(count);

        // Find the longest name (by character length)
        int longestCount = 0;
        String longestName = "";
        for (String name : names) {
            String t = name.trim();
            if (t.length() > longestCount) {
                longestCount = t.length();
                longestName = t;
            }
        }
        if (!longestName.isEmpty()) {
            System.out.println("Longest name: " + longestName + " (" + longestCount + " chars)");
        }
        
        
    }
}
