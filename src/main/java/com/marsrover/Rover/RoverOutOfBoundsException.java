package com.marsrover.Rover;

public class RoverOutOfBoundsException extends RuntimeException{

	public RoverOutOfBoundsException() {
        super("The Rover cannot be out of bounds of the plateau!");
    }
}
