package com.marsrover.Command;

import com.marsrover.Rover.Rover;

public class SpinLeftCommand implements Command{
	@Override
    public void execute(Rover rover) {
        rover.spinLeft();
    }

}
