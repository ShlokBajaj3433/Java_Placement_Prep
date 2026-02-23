package com.shlok.StaticExample;


public class Human {
    int age;
    String name;
    int salary;
    static int Population;

    public Human(int age, String name, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        Human.Population++;
    }

}
