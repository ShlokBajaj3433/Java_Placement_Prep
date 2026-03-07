package com.shlok.Properties.inheritance;

public  class BoxWeight extends Box {
    double weight;

    BoxWeight() {
        super();
        this.weight = -1;
    }

    BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    //  System.out.println(super.height);
    }

    BoxWeight(double length, double height, double width, double weight) {
        super(length, height, width);
        this.weight = weight;
    }

    
}
