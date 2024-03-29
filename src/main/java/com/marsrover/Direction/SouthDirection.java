package com.marsrover.Direction;

import com.marsrover.Rover.Rover;

public class SouthDirection implements Direction{
	@Override
    public Direction spinRight() {
        return new WestDirection();
    }

    @Override
    public Direction spinLeft() {
        return new EastDirection();
    }

    @Override
    public void moveForward(Rover rover) {
        rover.setCoordinateY(rover.getCoordinateY() - 1);
    }

    @Override
    public void moveBack(Rover rover) {
        rover.setCoordinateY(rover.getCoordinateY() + 1);
    }

}
