package com.shlok.Properties.inheritance;

public class Box {
    private double length;
    double height;
    double width;

    Box() {
        this.length = -1;
        this.height = -1;
        this.width = -1;
    }
    // cube
    Box(double side) {
        this.length = side;
        this.height = side;
        this.width = side;
    }

    Box(double length, double height, double width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    
}
