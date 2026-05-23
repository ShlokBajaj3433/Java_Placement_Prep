package com.shlok.Properties.inheritance.Multilevel;

public class GrandParent {
    protected String grandParentName;

    GrandParent(String grandParentName) {
        this.grandParentName = grandParentName;
    }

    public String getGrandParentName() {
        return grandParentName;
    }

    public void showGrandParentInfo() {
        System.out.println("GrandParent name: " + grandParentName);
    }
}