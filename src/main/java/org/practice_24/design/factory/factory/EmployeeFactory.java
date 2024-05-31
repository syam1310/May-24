package org.practice_24.design.factory.factory;

public class EmployeeFactory {

    public Employee getEmployee(String empType) {
        if (empType.trim().equalsIgnoreCase("software engineer")) {
            return new SoftwareEngineer();
        } else if (empType.trim().equalsIgnoreCase("manager")) {
            return new Manager();
        } else {
            return null;
        }
    }
}
