package com.company.CreationalPatterns.AbstractFactory;

public interface IBollywoodMovie {
    public void getMovieName();
}

class BollywoodActionMovie implements IBollywoodMovie{
    @Override
    public void getMovieName() {
        System.out.println("Bollywood Action Movie");
    }
}

class BollywoodComedyMovie implements IBollywoodMovie{
    @Override
    public void getMovieName() {
        System.out.println("Bollywood Comedy Movie");
    }
}