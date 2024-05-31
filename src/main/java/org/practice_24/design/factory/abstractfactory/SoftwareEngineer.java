package org.practice_24.design.factory.abstractfactory;

public class SoftwareEngineer implements  Employee{
    public String name(){
        System.out.println("I am Software Engineer");
        return "SOFTWARE ENGINEER";
    }
    public double salary(){
        System.out.println("Salary: "+ 4300);
        return 43233333;
    }

}
