package com.marsrover.Command;

import com.marsrover.Rover.Rover;

public class MoveBackCommand implements Command{
	
	@Override
    public void execute(Rover rover) {
        rover.moveBack();;
    }

}
