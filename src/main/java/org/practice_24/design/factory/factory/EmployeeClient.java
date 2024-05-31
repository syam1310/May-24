package org.practice_24.design.factory.factory;

public class EmployeeClient {
    public static void main(String[] args) {
        Employee e1 = new EmployeeFactory().getEmployee("software engineer");
        System.out.println(e1.name() + " " + e1.salary());

        Employee e2 = new EmployeeFactory().getEmployee("manager");
        System.out.println(e2.name() + " " + e2.salary());

    }
}
