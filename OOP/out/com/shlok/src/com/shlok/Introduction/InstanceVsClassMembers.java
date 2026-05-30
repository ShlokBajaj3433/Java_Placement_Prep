package com.shlok.Introduction;

public class InstanceVsClassMembers {
    // Instance members belong to each object
    int id;
    String name;

    // Class members belong to the class itself
    static String college = "ABC Institute";
    static int studentCount = 0;

    public InstanceVsClassMembers(int id, String name) {
        this.id = id;
        this.name = name;
        studentCount++;
    }

    void printInstanceInfo() {
        System.out.println("Id: " + id + ", Name: " + name + ", College: " + college);
    }

    static void printClassInfo() {
        System.out.println("College: " + college + ", Total Students: " + studentCount);
    }

    public static void main(String[] args) {
        InstanceVsClassMembers s1 = new InstanceVsClassMembers(1, "Shlok");
        InstanceVsClassMembers s2 = new InstanceVsClassMembers(2, "Sparsh");

        s1.printInstanceInfo();
        s2.printInstanceInfo();
        InstanceVsClassMembers.printClassInfo();
    }
}
