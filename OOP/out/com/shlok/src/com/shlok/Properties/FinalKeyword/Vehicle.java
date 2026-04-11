package com.shlok.Properties.FinalKeyword;

// final class - cannot be extended/inherited
final class Constants {
    static final double PI = 3.14159;
}

// Base class with a final method
class Vehicle {
    // final variable - value cannot be changed once assigned
    final int MAX_SPEED = 120;

    // final method - cannot be overridden in subclasses
    final void fuelType() {
        System.out.println("Vehicle runs on petrol or diesel.");
    }

    void describe() {
        System.out.println("I am a generic vehicle.");
    }
}

class Car extends Vehicle {
    // Allowed: overriding a non-final method
    @Override
    void describe() {
        System.out.println("I am a Car.");
    }

    // NOT allowed: overriding a final method — uncommenting causes compile error
    // @Override
    // void fuelType() {
    //     System.out.println("Electric");
    // }
}

// NOT allowed: extending a final class — uncommenting causes compile error
// class MoreConstants extends Constants { }
