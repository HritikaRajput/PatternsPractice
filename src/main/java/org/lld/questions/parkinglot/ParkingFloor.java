package org.lld.questions.parkinglot;

import org.lld.questions.parkinglot.parkingspot.ParkingSpot;
import org.lld.questions.parkinglot.vehicle.Vehicle;

import java.util.List;
import java.util.Optional;

public class ParkingFloor {
    private final int floorNumber;
    private final List<ParkingSpot> parkingSpotList;

    ParkingFloor(int number, List<ParkingSpot> parkingSpotList) {
        this.floorNumber = number;
        this.parkingSpotList = parkingSpotList;
    }

    public synchronized Optional<ParkingSpot> getAvailableSpots(Vehicle vehicle) {
        return parkingSpotList.stream()
                .filter(parkingSpot -> parkingSpot.isAvailable() && parkingSpot.canFit(vehicle))
                .findFirst();

    }
 }
