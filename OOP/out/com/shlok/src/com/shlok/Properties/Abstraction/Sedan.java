package com.shlok.Properties.Abstraction;

public class Sedan extends Car {
    @Override
    public void start() {
        System.out.println("Sedan is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Sedan is stopping...");
    }
}