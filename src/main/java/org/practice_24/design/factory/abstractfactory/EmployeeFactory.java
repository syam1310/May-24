package org.practice_24.design.factory.abstractfactory;

public class EmployeeFactory {
    public Employee getEmployee(EmployeeAbstractFactory employeeAbstractFactory){
        return employeeAbstractFactory.createEmployee();
    }
}
