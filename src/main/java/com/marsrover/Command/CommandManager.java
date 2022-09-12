package com.marsrover.Command;

import java.util.ArrayList;

import com.marsrover.Rover.Rover;

public class CommandManager {

private Rover rover;
public CommandManager(Rover rover) {
	this.rover=rover;
}
public void executeCommandList(ArrayList<Command> commands) {
	        for (Command command : commands)
	            command.execute(rover);
}

}
