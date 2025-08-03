package org.lld.questions.parkinglot;

import org.lld.questions.parkinglot.feestrategy.FeeStrategy;
import org.lld.questions.parkinglot.feestrategy.FlatFeeStrategy;
import org.lld.questions.parkinglot.parkingspot.ParkingSpot;
import org.lld.questions.parkinglot.vehicle.Vehicle;

import java.util.*;

public class ParkingLot {
    private static final ParkingLot INSTANCE = new ParkingLot();
    private final List<ParkingFloor> floorList = new ArrayList<>();
    private final Map<String, ParkingTicket> getActiveTicket = new HashMap<>();
    private FeeStrategy feeStrategy;

    private ParkingLot() {
        feeStrategy = new FlatFeeStrategy();
    }
    public static synchronized ParkingLot getInstance() {
        return INSTANCE;
    }

    public void addFloors(ParkingFloor floor) {
        this.floorList.add(floor);
    }

    public synchronized ParkingTicket parkVehicle(Vehicle vehicle) throws Exception {
        for(ParkingFloor floor: floorList) {
           Optional<ParkingSpot> parkingSpot = floor.getAvailableSpots(vehicle);
           if(parkingSpot.isPresent()) {
               ParkingSpot spot = parkingSpot.get();

                   if(spot.parkVehicle(vehicle)) {
                       ParkingTicket parkingTicket = new ParkingTicket(vehicle, spot);
                       this.getActiveTicket.put(vehicle.getLicense(), parkingTicket);
                       return parkingTicket;
                   }

           }
        }
        throw new Exception("no spots available");
    }

    public synchronized double unparkVehicle(Vehicle vehicle) throws Exception {
        if(this.getActiveTicket.get(vehicle.getLicense()) != null) {
            ParkingTicket ticket = this.getActiveTicket.get(vehicle.getLicense());
            ticket.setExitTime();

            ticket.getParkingSpot().unparkVehicle();

            return this.feeStrategy.calculateCost(ticket);
        }
        throw new Exception("ticket not found");
    }
}
