package com.shlok.Basic.Recursion;

public class BigestNum {
    
    static int big(int n){
        if (n / 10 == 0) {
            return 0;
        }
        
        int last = n%10;
        int maxOfRest = big(n / 10);
            
        return (last > maxOfRest) ? last : maxOfRest;
    }

    public static void main(String[] args) {
        System.out.println(big(1423123));
    }
}
