package org.practice_24.design.factory.abstractfactory;

public class Manager implements Employee{
    @Override
    public double salary() {
        System.out.println("Salary: "+433333333);
        return 32222222;
    }

    @Override
    public String name() {
        System.out.println("I am a Manager");
        return "MANAGER";
    }
}
