package com.company;

import com.company.CreationalPatterns.AbstractFactory.FactoryProducer;
import com.company.CreationalPatterns.AbstractFactory.IBollywoodMovie;
import com.company.CreationalPatterns.AbstractFactory.IHollywoodMovie;
import com.company.CreationalPatterns.AbstractFactory.IMovieFactory;

public class Main {

    public static void main(String[] args) {

        //Factory
//        Animal animal = AnimalFactory.getAnimalInstance("Tiger");
//        animal.eat();
//        animal.walk();
//
//        animal = AnimalFactory.getAnimalInstance("Duck");
//        animal.eat();
//        animal.walk();
        //Abstract Factory

        IMovieFactory movieFactory = FactoryProducer.getMovieFactory("action");
        IBollywoodMovie bollywoodMovie = movieFactory.getBollywoodMovie();
        bollywoodMovie.getMovieName();
        IHollywoodMovie hollywoodMovie = movieFactory.getHollywoodMovie();
        hollywoodMovie.getMovieName();
        movieFactory = FactoryProducer.getMovieFactory("Comedy");
        bollywoodMovie = movieFactory.getBollywoodMovie();
        bollywoodMovie.getMovieName();
        hollywoodMovie = movieFactory.getHollywoodMovie();
        hollywoodMovie.getMovieName();
    }
}
