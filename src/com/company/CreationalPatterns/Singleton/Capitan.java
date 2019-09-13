package com.company.CreationalPatterns.Singleton;

class Capitan {

    private Capitan() {
    }

    private static class SingletonHelper {
        private static final Capitan capitan = new Capitan();
    }

    Capitan getInstance() {
        return SingletonHelper.capitan;
    }

}
