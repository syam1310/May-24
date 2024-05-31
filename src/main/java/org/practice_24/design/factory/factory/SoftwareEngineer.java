package org.practice_24.design.factory.factory;

public class SoftwareEngineer implements Employee {
    public String name() {
        System.out.println("I am software engineer");
        return "SOFTWARE ENGINEER";
    }

    public double salary() {
        System.out.println("Salary: " + 200000);
        return 2220000;
    }
}
