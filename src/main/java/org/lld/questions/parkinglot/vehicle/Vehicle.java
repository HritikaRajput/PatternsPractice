package org.lld.questions.parkinglot.vehicle;

public abstract class Vehicle {
    String license;
    VehicleType vehicleType;

    Vehicle(String license) {

        this.license = license;
    }

    public VehicleType getVehicleType() {
        return this.vehicleType;
    }

    public String getLicense() {
        return this.license;
    }
}
