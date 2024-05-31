package org.practice_24.design.factory;

public class Main {
    public static void main(String[] args) {
        MotorVehicleFactory motorVehicleFactory = new MotorcycleFactory();
        motorVehicleFactory.createMotorVehicle().build();

        MotorVehicleFactory motorVehicleFactory1 = new CarFactory();
        motorVehicleFactory1.createMotorVehicle().build();



    }
}
