package com.marsrover.Direction;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.marsrover.BaseTest;
import com.marsrover.Rover.Rover;

public class NorthDirectionTest extends BaseTest{
	
	@Before
    public void setUp() throws Exception {
        direction = new NorthDirection();
        rover = new Rover(plateau, xCoordinate, yCoordinate, direction);
    }

    @Test
    public void whenNorthDirectionTurnsRightNewDirectionIsEast() throws Exception {
        assertEquals(EastDirection.class, direction.spinRight().getClass());
    }

    @Test
    public void whenNorthDirectionTurnsLeftNewDirectionIsWest() throws Exception {
        assertEquals(WestDirection.class, direction.spinLeft().getClass());
    }

    @Test
    public void whenNorthDirectionMovesForwardCoordinateYIncrements() throws Exception {
        direction.moveForward(rover);
        assertEquals(++yCoordinate, rover.getCoordinateY());
    }

    @Test
    public void whenNorthDirectionMovesBackCoordinateYDecrements() throws Exception {
        direction.moveBack(rover);
        assertEquals(--yCoordinate, rover.getCoordinateY());
    }

}
