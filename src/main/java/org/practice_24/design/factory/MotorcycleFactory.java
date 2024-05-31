package org.practice_24.design.factory;

public class MotorcycleFactory extends MotorVehicleFactory {
    @Override
    protected MotorVehicle createMotorVehicle() {
        return new MotorCycle();
    }
}
