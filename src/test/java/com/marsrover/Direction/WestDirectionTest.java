package com.marsrover.Direction;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.marsrover.BaseTest;
import com.marsrover.Rover.Rover;

public class WestDirectionTest extends BaseTest{
	@Before
    public void setUp() throws Exception {
        direction = new WestDirection();
        rover = new Rover(plateau, xCoordinate, yCoordinate, direction);
    }

    @Test
    public void whenWestDirectionTurnsRightNewDirectionIsNorth() throws Exception {
        assertEquals(NorthDirection.class,direction.spinRight().getClass() );
    }

    @Test
    public void whenWestDirectionTurnsLeftNewDirectionIsSouth() throws Exception {
        assertEquals( SouthDirection.class,direction.spinLeft().getClass());
    }

    @Test
    public void whenWestDirectionMovesForwardCoordinateXDecrements() throws Exception {
        direction.moveForward(rover);
        assertEquals(--xCoordinate, rover.getCoordinateX());
    }

    @Test
    public void whenWestDirectionMovesBackCoordinateXIncrements() throws Exception {
        direction.moveBack(rover);
        assertEquals(++xCoordinate, rover.getCoordinateX());
    }

}
