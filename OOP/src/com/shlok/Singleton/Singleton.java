package com.shlok.Singleton;

public class Singleton {
    private static Singleton instance;
        
        private Singleton() {
        }
        
        public static Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2); // true because both references point to the same object

        // Singleton class is a class that can have only one object. It is used to restrict the instantiation of a class to a single
        // object and provide a global point of access to the object. It is used in cases where we want to have only one instance of a class and we want
    }
}
