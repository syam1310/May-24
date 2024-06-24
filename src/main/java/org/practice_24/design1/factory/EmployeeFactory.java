package org.practice_24.design1.factory;

public class EmployeeFactory {
    public static Employee getEmployee(String type){
        if(type.equalsIgnoreCase("manager")){
            return new Manager();
        }else if(type.equalsIgnoreCase("softwareEngineer")){
            return new SoftwareEngineer();
        }
        return null;
    }
}
