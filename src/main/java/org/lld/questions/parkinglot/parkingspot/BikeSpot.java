package org.lld.questions.parkinglot.parkingspot;

import org.lld.questions.parkinglot.vehicle.Vehicle;
import org.lld.questions.parkinglot.vehicle.VehicleType;

public class BikeSpot extends ParkingSpot{
    BikeSpot(int id) {
        super(id);
    }

    @Override
    public boolean canFit(Vehicle vehicle) {
        return vehicle.getVehicleType().equals(VehicleType.BIKE);
    }
}
