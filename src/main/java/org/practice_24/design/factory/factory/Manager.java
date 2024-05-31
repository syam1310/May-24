package org.practice_24.design.factory.factory;

public class Manager implements Employee {
    public String name() {
        System.out.println("I am Manager");
        return "MANAGER";
    }

    public double salary() {
        System.out.println("Salary: " + 1000000);
        return 3000000;
    }
}
