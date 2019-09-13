package com.company.CreationalPatterns.AbstractFactory;

public interface IHollywoodMovie {
    void getMovieName();
}


class HollywoodActionMovie implements IHollywoodMovie{
    @Override
    public void getMovieName() {
        System.out.println("Hollywood Action Movie");
    }
}

class HollywoodComedyMovie implements IHollywoodMovie{
    @Override
    public void getMovieName() {
        System.out.println("Hollywood Comedy Movie");
    }
}
