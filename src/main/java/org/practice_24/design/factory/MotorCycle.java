package org.practice_24.design.factory;

public class MotorCycle implements MotorVehicle {

    @Override
    public void build() {
        System.out.println("Build MotoCycle!");
    }
}
