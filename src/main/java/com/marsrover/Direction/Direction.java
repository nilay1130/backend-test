package com.marsrover.Direction;

import com.marsrover.Rover.Rover;

public interface Direction {

	public Direction spinRight();
	public Direction spinLeft();
	public void moveForward(Rover rover);
	public void moveBack(Rover rover);
}
