package com.shlok.Properties.FinalKeyword;

public class Main {
    public static void main(String[] args) {

        // ── 1. final VARIABLE ───────────────────────────────────────────────
        final int MAX_RETRIES = 3;
        System.out.println("Max retries allowed: " + MAX_RETRIES);

        // NOT allowed: reassigning a final variable — uncommenting causes compile error
        // MAX_RETRIES = 5;

        // ── 2. final INSTANCE VARIABLE in a class ──────────────────────────
        Vehicle v = new Vehicle();
        System.out.println("Vehicle max speed: " + v.MAX_SPEED + " km/h");

        // NOT allowed: changing a final field — uncommenting causes compile error
        // v.MAX_SPEED = 200;

        // ── 3. final METHOD ─────────────────────────────────────────────────
        Car car = new Car();
        car.describe();          // overridden — prints Car-specific message
        car.fuelType();          // final method from Vehicle — cannot be overridden

        // ── 4. static final (CONSTANT) via final CLASS ──────────────────────
        System.out.println("Value of PI from Constants: " + Constants.PI);
    }
}
