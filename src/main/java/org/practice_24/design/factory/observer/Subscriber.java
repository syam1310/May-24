package org.practice_24.design.factory.observer;

public class Subscriber implements Observer {
    String name;

    Subscriber(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void notified(String title) {
        System.out.println("Hello " + this.name + " new Video uploaded : "+ title);
    }
}
