package org.lld.questions.elevatorsystem.strategy;

import org.lld.questions.elevatorsystem.entities.Elevator;
import org.lld.questions.elevatorsystem.entities.LiftRequest;

import java.util.List;
import java.util.Optional;

public class NearestLiftStrategy implements LiftSelectionStrategy{
    @Override
    public Optional<Elevator> selectLift(List<Elevator> elevatorList, LiftRequest liftRequest) {
        //make strategy
        return Optional.empty();
    }
}
