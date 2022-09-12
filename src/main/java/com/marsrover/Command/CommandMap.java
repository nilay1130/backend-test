package com.marsrover.Command;

public enum CommandMap {
	
	 R(new SpinRightCommand()),

	 L(new SpinLeftCommand()),

	 F(new MoveForwardCommand()),

	 B(new MoveBackCommand());

	 private  Command command;

	    CommandMap(Command command) {
	        this.command = command;
	    }

	    public Command getCommand() {
	        return command;
	    }

}
