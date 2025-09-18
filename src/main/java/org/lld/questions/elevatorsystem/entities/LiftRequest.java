package org.lld.questions.elevatorsystem.entities;

public class LiftRequest {
    private final int destFloor;
    private final Direction direction;
    private final RequestSource requestSource;

    public LiftRequest(int destFloor, Direction direction, RequestSource requestSource) {
        this.destFloor = destFloor;
        this.direction = direction;
        this.requestSource = requestSource;
    }

    public RequestSource getRequestSource() {
        return requestSource;
    }

    public int getDestFloor() {
        return destFloor;
    }
    public Direction getDirection() {
        return direction;
    }


 }
