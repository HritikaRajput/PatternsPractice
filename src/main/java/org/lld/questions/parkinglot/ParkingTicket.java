package org.lld.questions.parkinglot;

import org.lld.questions.parkinglot.parkingspot.ParkingSpot;
import org.lld.questions.parkinglot.vehicle.Vehicle;

import java.util.Date;

public class ParkingTicket {
    private final String ticketId;
    private final double entryTime;
    private double exitTime;
    private final Vehicle vehicle;
    private final ParkingSpot parkingSpot;

    ParkingTicket(Vehicle vehicle, ParkingSpot parkingSpot) {
        this.vehicle= vehicle;
        this.parkingSpot = parkingSpot;
        this.ticketId = String.valueOf(new Date().getTime());
        this.entryTime = new Date().getTime();
    }

    public void setExitTime() {
        this.exitTime = new Date().getTime();
    }

    public double getEntryTime() {
        return this.entryTime;
    }
    public double getExitTime() {
        return this.exitTime;
    }

    public String getTicketId() {
        return this.ticketId;
    }

    public ParkingSpot getParkingSpot() {
        return this.parkingSpot;
    }

}
