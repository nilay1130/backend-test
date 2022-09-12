package com.marsrover;

import com.marsrover.Command.Command;
import com.marsrover.Command.CommandManager;
import com.marsrover.Direction.Direction;
import com.marsrover.Rover.Rover;

public class BaseTest {
	protected final Plateau plateau = new Plateau(5, 5);
    protected int xCoordinate = 2;
    protected int yCoordinate = 2;
    protected Direction direction;
    protected Rover rover;
    protected Command command;
    protected CommandManager cm;

}
