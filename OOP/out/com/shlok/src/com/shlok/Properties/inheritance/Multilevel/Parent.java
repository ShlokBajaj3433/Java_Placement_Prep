package com.shlok.Properties.inheritance.Multilevel;

public class Parent extends GrandParent {
    protected int parentAge;

    Parent(String grandParentName, int parentAge) {
        super(grandParentName);
        this.parentAge = parentAge;
    }

    public int getParentAge() {
        return parentAge;
    }

    public void showParentInfo() {
        System.out.println("Parent age: " + parentAge);
    }
}