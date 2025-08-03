package org.lld.questions.parkinglot.feestrategy;

import org.lld.questions.parkinglot.ParkingTicket;

public interface FeeStrategy {
    double calculateCost(ParkingTicket ticket);
}
