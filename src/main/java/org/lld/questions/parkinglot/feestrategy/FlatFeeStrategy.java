package org.lld.questions.parkinglot.feestrategy;

import org.lld.questions.parkinglot.ParkingTicket;

public class FlatFeeStrategy implements FeeStrategy{
    private static final double rate = 10;
    @Override
    public double calculateCost(ParkingTicket ticket) {
        return (ticket.getExitTime() - ticket.getEntryTime()) * rate;
    }
}
