package org.practice_24.design1.factory;

public class Driver {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee("softwareEngineer");
        employee.name();
    }
}
