package com.shlok.Properties.inheritance.Multilevel;

public class Child extends Parent {
    private String childSchool;

    Child(String grandParentName, int parentAge, String childSchool) {
        super(grandParentName, parentAge);
        this.childSchool = childSchool;
    }

    public String getChildSchool() {
        return childSchool;
    }

    public void showChildInfo() {
        System.out.println("Child school: " + childSchool);
    }
}