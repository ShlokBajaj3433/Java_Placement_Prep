package com.shlok.Basic.String;

public class Vovals {
    public static void main(String[] args) {
        String str = "Shlok Bajaj";

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                System.out.println(str.charAt(i));
            }
        }
    }
}