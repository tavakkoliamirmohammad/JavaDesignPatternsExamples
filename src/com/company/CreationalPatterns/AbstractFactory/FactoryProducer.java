package com.company.CreationalPatterns.AbstractFactory;

public class FactoryProducer {

    public static IMovieFactory getMovieFactory(String type) {
        if (type == null) {
            return null;
        }

        if (type.equalsIgnoreCase("Action")) {
            return new ActionMovieFactory();
        }
        if (type.equalsIgnoreCase("Comedy")) {
            return new ComedyMovieFactory();
        }
        return null;
    }
}
