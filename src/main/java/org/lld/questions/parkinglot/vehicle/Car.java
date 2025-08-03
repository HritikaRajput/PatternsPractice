package org.lld.questions.parkinglot.vehicle;

public class Car extends Vehicle{
    public Car(String license) {
        super(license);
        this.vehicleType = VehicleType.CAR;
    }
}
