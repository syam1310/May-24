package org.practice_24.design.factory.abstractfactory;

public class SoftwareEngineerFactory extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new SoftwareEngineer();
    }
}
