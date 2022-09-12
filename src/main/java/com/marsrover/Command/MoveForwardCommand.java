package com.marsrover.Command;

import com.marsrover.Rover.Rover;

public class MoveForwardCommand implements Command{
	@Override
    public void execute(Rover rover) {
        rover.moveForward();
    }
	
	
}
