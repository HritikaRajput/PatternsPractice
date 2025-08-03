package org.lld.questions.parkinglot;

import org.lld.questions.parkinglot.parkingspot.ParkingSpot;
import org.lld.questions.parkinglot.parkingspot.ParkingSpotFactory;
import org.lld.questions.parkinglot.parkingspot.ParkingSpotType;
import org.lld.questions.parkinglot.vehicle.Bike;
import org.lld.questions.parkinglot.vehicle.Car;
import org.lld.questions.parkinglot.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotDemo {
    public static void run() {
        ParkingLot parkingLot = ParkingLot.getInstance();

        // Create spots
        List<ParkingSpot> floor1Spots = List.of(
                ParkingSpotFactory.createSpot(ParkingSpotType.CAR, 1),
                ParkingSpotFactory.createSpot(ParkingSpotType.BIKE,7)
        );
        ParkingFloor floor1 = new ParkingFloor(0, floor1Spots);
        List<ParkingSpot> floor2Spots = List.of(
                ParkingSpotFactory.createSpot(ParkingSpotType.CAR, 1),
                ParkingSpotFactory.createSpot(ParkingSpotType.BIKE,7)
        );
        ParkingFloor floor2 = new ParkingFloor(1, floor2Spots);
        parkingLot.addFloors(floor1);

        parkingLot.addFloors(floor2);

        // Create vehicles
        Vehicle veh1 = new Car("UP32ABCD2343");
        Vehicle bike1 = new Bike("vdfgfsgsfgv");

        // Park Vehicle

        try {
            ParkingTicket ticket1 = parkingLot.parkVehicle(veh1);
            System.out.println("ticket generate for vehicke: "+ veh1 +" "+ ticket1.getTicketId());

            Vehicle veh3 = new Car("UP32ABCD2343");
            ParkingTicket ticket2 = parkingLot.parkVehicle(veh3);
            System.out.println("ticket generate for vehicke: "+ veh3 +" "+ ticket2.getTicketId());


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //unpark vehicle
        try {
            System.out.println("Unparking vehicle 1, total cost for paring: " + parkingLot.unparkVehicle(veh1));
            System.out.println("Unparking vehicle 2, total cost for paring: " + parkingLot.unparkVehicle(bike1));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        run();
    }
}
