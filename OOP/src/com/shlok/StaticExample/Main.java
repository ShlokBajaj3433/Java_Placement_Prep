package com.shlok.StaticExample;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human(23, "Shlok", 100000);
        Human h2 = new Human(24, "Sparsh", 50000);
        System.out.println(h1.name + " " + h1.age + " " + h1.salary);
        System.out.println(h2.name + " " + h2.age + " " + h2.salary);

        System.out.println(Human.Population);
        System.out.println(Human.Population);

        // Static method can be called without creating an object of the class
        Greet();
    }

    void fun() {
        System.out.println("This is a static method");
        Greet();
    }

    static void Greet() {
        System.out.println("Hello");
        // fun();  This will give an error because we cannot call a non-static method from a static method
        // reason: static methods belong to the class and non-static methods belong to the object. Static methods can be called without creating an object of the class, but non-static methods cannot be called without creating an object of the class.

        Main obj = new Main();
        obj.fun(); // we can call a non-static method from a static method by creating an object of the class
    }
}