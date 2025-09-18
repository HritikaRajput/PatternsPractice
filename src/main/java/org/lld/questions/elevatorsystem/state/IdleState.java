package org.lld.questions.elevatorsystem.state;

import org.lld.questions.elevatorsystem.entities.Direction;
import org.lld.questions.elevatorsystem.entities.Elevator;
import org.lld.questions.elevatorsystem.entities.LiftRequest;

public class IdleState implements ElevatorState{
    @Override
    public void move(Elevator elevator) {

    }

    @Override
    public void addRequest(Elevator elevator, LiftRequest liftRequest) {

    }

    @Override
    public Direction getDirection() {
        return null;
    }
}
