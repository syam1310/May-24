package org.practice_24.design.factory.abstractfactory;

public class ClientCode {
    public static void main(String[] args) {
        Employee e1 = new EmployeeFactory().getEmployee(new SoftwareEngineerFactory());
        Employee e2 = new EmployeeFactory().getEmployee(new ManagerFactory());

        System.out.println(e1.name());
        System.out.println(e2.name());
    }
}
