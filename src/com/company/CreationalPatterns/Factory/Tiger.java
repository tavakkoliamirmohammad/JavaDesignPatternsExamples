package com.company.CreationalPatterns.Factory;

public class Tiger implements Animal {

    @Override
    public void eat() {
        System.out.println("Tiger is eating");
    }

    @Override
    public void walk() {
        System.out.println("Tiger is walking");
    }
}
