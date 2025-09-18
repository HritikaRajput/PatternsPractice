package org.lld.questions.elevatorsystem;

import org.lld.questions.elevatorsystem.entities.Direction;
import org.lld.questions.elevatorsystem.entities.Elevator;
import org.lld.questions.elevatorsystem.entities.LiftRequest;
import org.lld.questions.elevatorsystem.entities.RequestSource;
import org.lld.questions.elevatorsystem.strategy.LiftSelectionStrategy;
import org.lld.questions.elevatorsystem.strategy.NearestLiftStrategy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ElevatorSystem {
    private static ElevatorSystem INSTANCE;
    private final LiftSelectionStrategy selectionStrategy;
    private final Map<Integer, Elevator> elevatorMap;

    private ElevatorSystem(int noOfElevators){
        this.selectionStrategy = new NearestLiftStrategy();
        this.elevatorMap = new HashMap<>();
        for(int i=0;i<noOfElevators;i++) {
            this.elevatorMap.put(i, new Elevator(i));
        }
    }

    public static synchronized ElevatorSystem getINSTANCE(int noOfElevators) {
        if(INSTANCE == null) {
            synchronized (ElevatorSystem.class) {
                if(INSTANCE == null) {
                    INSTANCE = new ElevatorSystem(noOfElevators);
                }
            }
        }
        return INSTANCE;
    }

    // external buttons
    public void requestFloor(int floor, Direction direction) {
        LiftRequest liftRequest = new LiftRequest(floor, direction, RequestSource.EXTERNAL);
        Optional<Elevator> selectedElevator = selectionStrategy.selectLift((List<Elevator>) this.elevatorMap.values(),liftRequest);

        if(selectedElevator.isPresent()) {
            selectedElevator.get().addRequest(liftRequest);
        } else {
            System.out.println("system busy");
        }
    }
    //internal button
    public void selectFloor(int floor, int elevatorId) {

        Elevator currentElevator = elevatorMap.get(elevatorId);
        if(currentElevator != null)
                currentElevator.addRequest(new LiftRequest(floor, Direction.IDLE, RequestSource.INTERNAL));
        else {
            System.out.println("elevator not found");
        }
    }


}
