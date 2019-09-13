package com.company.CreationalPatterns.Factory;

public class Duck implements Animal {


    @Override
    public void eat() {
        System.out.println("Duck is eating");
    }

    @Override
    public void walk() {
        System.out.println("Duck is walking");
    }
}
