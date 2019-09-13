package com.company.CreationalPatterns.Factory;

public abstract class AnimalFactory {
    public static Animal getAnimalInstance(String modelName) {
        if (modelName == null) {
            return null;
        }
        switch (modelName) {
            case "Tiger":
                return new Tiger();
            case "Duck":
                return new Duck();
            default:
                return null;
        }
    }
}
