package com.marsrover.Direction;

public enum DirectionMap {

	N(new NorthDirection()),

    E(new EastDirection()),

    S(new SouthDirection()),

    W(new WestDirection());

    private  Direction direction;

    DirectionMap(Direction direction) {
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }
}
