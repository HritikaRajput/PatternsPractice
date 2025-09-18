package org.lld.questions.elevatorsystem.entities;

//import org.example.patterns.chainofresponsibility.Request;

import org.lld.questions.elevatorsystem.state.ElevatorState;
import org.lld.questions.elevatorsystem.state.IdleState;

import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

public class Elevator {
    private final int id;
    private AtomicInteger currentFloor;
    private final TreeSet<Integer> upRequests;
    private final TreeSet<Integer>  downRequests;
    private ElevatorState elevatorState;

    public Elevator(int id) {
        this.id = id;
        this.upRequests = new TreeSet<>();
        this.downRequests = new TreeSet<>();
        this.elevatorState = new IdleState();
    }

   public void move() {
        elevatorState.move(this);
   }

   public synchronized void addRequest(LiftRequest liftRequest) {
       elevatorState.addRequest(this, liftRequest);
   }

   public int getId() {
        return this.id;
   }
   public AtomicInteger getCurrentFloor() {
        return this.currentFloor;
   }
   public Direction direction() {
        return elevatorState.getDirection();
   }
   public TreeSet<Integer> getUpRequests() {
        return this.upRequests;
   }
   public TreeSet<Integer> getDownRequests() {
        return this.downRequests;
   }

   public void setCurrentFloor(int floor) {
        this.currentFloor.set(floor);
   }

}
