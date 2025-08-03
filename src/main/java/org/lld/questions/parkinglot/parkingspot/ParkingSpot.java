package org.lld.questions.parkinglot.parkingspot;

import org.lld.questions.parkinglot.vehicle.Vehicle;

public abstract class ParkingSpot {
    private final int id;
    private boolean isOccupied;
    private Vehicle vehicle;

    ParkingSpot(int id) {
        this.id = id;
        this.isOccupied = false;
    }

    public synchronized boolean isAvailable() {
        return !this.isOccupied;
    }

    public synchronized boolean parkVehicle(Vehicle vehicle) {
        if(this.isOccupied) {
            return false;
        }
        this.isOccupied = true;
        this.vehicle = vehicle;
        return true;
    }
    public synchronized void unparkVehicle() {
        this.vehicle = null;
        this.isOccupied = false;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getId() {
        return id;
    }

    public abstract boolean canFit(Vehicle vehicle);
}
