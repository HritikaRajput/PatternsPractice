package org.lld.questions.parkinglot.vehicle;

public class Bike extends Vehicle{
    public Bike(String license) {
        super(license);
        this.vehicleType = VehicleType.BIKE;
    }
}
