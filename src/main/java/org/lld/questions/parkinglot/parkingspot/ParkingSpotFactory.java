package org.lld.questions.parkinglot.parkingspot;

public class ParkingSpotFactory {
    public static ParkingSpot createSpot(ParkingSpotType parkingSpotType, int spotId) {
        switch (parkingSpotType) {
            case CAR:
                return new CarSpot(spotId);
            case BIKE:
                return new BikeSpot(spotId);
            default:
                return null;
        }
    }
}
