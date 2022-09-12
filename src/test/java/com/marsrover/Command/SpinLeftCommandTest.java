package com.marsrover.Command;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.marsrover.BaseTest;
import com.marsrover.Direction.NorthDirection;
import com.marsrover.Direction.WestDirection;
import com.marsrover.Rover.Rover;

public class SpinLeftCommandTest extends BaseTest{
	
	 @Before
	    public void setUp() throws Exception {
	        direction = new NorthDirection();
	        rover = new Rover(plateau, xCoordinate, yCoordinate, direction);
	        command = new SpinLeftCommand();
	    }

	   @Test
	    public void whenSpinLeftCommandIsExecuted() throws Exception {
	        command.execute(rover);
	        assertEquals(WestDirection.class, rover.getDirection().getClass());
	    }

}
