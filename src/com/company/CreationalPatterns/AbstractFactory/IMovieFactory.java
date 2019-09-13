package com.company.CreationalPatterns.AbstractFactory;

public interface IMovieFactory {
    IBollywoodMovie getBollywoodMovie();

    IHollywoodMovie getHollywoodMovie();
}


class ActionMovieFactory implements IMovieFactory {

    @Override
    public IBollywoodMovie getBollywoodMovie() {
        return new BollywoodActionMovie();
    }

    @Override
    public IHollywoodMovie getHollywoodMovie() {
        return new HollywoodActionMovie();
    }
}

class ComedyMovieFactory implements IMovieFactory {

    @Override
    public IBollywoodMovie getBollywoodMovie() {
        return new BollywoodComedyMovie();
    }

    @Override
    public IHollywoodMovie getHollywoodMovie() {
        return new HollywoodComedyMovie();
    }
}