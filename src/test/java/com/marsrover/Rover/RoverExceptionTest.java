package com.marsrover.Rover;

import org.junit.Before;
import org.junit.Test;

import com.marsrover.BaseTest;
import com.marsrover.Direction.NorthDirection;

public class RoverExceptionTest extends BaseTest{
	    @Before
	    public void setUp() throws Exception {
	        direction = new NorthDirection();
	        rover = new Rover(plateau, xCoordinate, yCoordinate, direction);
	    }

	    @Test(expected = NullPointerException.class)
	    public void whenRoverIsCreatedWithANullPlateauExceptionIsThrown() {
	        new Rover(null, xCoordinate, yCoordinate, direction);
	    }

	    @Test(expected = NullPointerException.class)
	    public void whenRoverIsCreatedWithANullDirectionExceptionIsThrown() {
	        new Rover(plateau, xCoordinate, yCoordinate, null);
	    }

	    @Test(expected = RoverOutOfBoundsException.class)
	    public void whenRoverIsCreatedOutOfPlateauBoundsExceptionIsThrown() {
	        new Rover(plateau, -1, 6, direction);
	    }

}
