package org.lld.questions.parkinglot.parkingspot;

import org.lld.questions.parkinglot.vehicle.Vehicle;
import org.lld.questions.parkinglot.vehicle.VehicleType;

public class CarSpot extends ParkingSpot {
    CarSpot(int id) {
        super(id);
    }

    @Override
    public boolean canFit(Vehicle vehicle) {
        return vehicle.getVehicleType().equals(VehicleType.CAR);
    }

}
