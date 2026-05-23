package com.shlok.Properties.inheritance.Multilevel;

public class Main {
    public static void main(String[] args) {
        Child child = new Child("SS", 24, "Placement Prep ");

        System.out.println(child.getGrandParentName());
        System.out.println(child.getParentAge());
        System.out.println(child.getChildSchool());

        child.showGrandParentInfo();
        child.showParentInfo();
        child.showChildInfo();
    }
}
