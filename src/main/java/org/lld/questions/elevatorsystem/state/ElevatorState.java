package org.lld.questions.elevatorsystem.state;

import org.lld.questions.elevatorsystem.entities.Direction;
import org.lld.questions.elevatorsystem.entities.Elevator;
import org.lld.questions.elevatorsystem.entities.LiftRequest;

public interface ElevatorState {
    void move(Elevator elevator);

    void addRequest(Elevator elevator, LiftRequest liftRequest);

    Direction getDirection();
}
