package com.marsrover.Command;

import com.marsrover.Rover.Rover;

public class SpinRightCommand implements Command{
	@Override
    public void execute(Rover rover) {
        rover.spinRight();
    }

}
