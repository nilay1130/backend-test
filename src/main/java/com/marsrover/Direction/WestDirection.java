package com.marsrover.Direction;

import com.marsrover.Rover.Rover;

public class WestDirection implements Direction{
	  @Override
	    public Direction spinRight() {
	        return new NorthDirection();
	    }

	    @Override
	    public Direction spinLeft() {
	        return new SouthDirection();
	    }

	    @Override
	    public void moveForward(Rover rover) {
	        rover.setCoordinateX(rover.getCoordinateX() - 1);
	    }

	    @Override
	    public void moveBack(Rover rover) {
	        rover.setCoordinateX(rover.getCoordinateX() + 1);
	    }

}
