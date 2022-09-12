package com.marsrover.Rover;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.marsrover.BaseTest;
import com.marsrover.Command.Command;
import com.marsrover.Command.CommandManager;
import com.marsrover.Command.MoveForwardCommand;
import com.marsrover.Command.SpinLeftCommand;
import com.marsrover.Command.SpinRightCommand;
import com.marsrover.Direction.EastDirection;
import com.marsrover.Direction.NorthDirection;
import com.marsrover.Direction.WestDirection;

public class RoverTest extends BaseTest{
	
	  @Before
	    public void setUp() throws Exception {
	        direction = new NorthDirection();
	        rover = new Rover(plateau, xCoordinate, yCoordinate, direction);
	        cm=new CommandManager(rover);
	    }

	    @Test
	    public void whenRequestedRoverCanSpinRight() throws Exception {
	        rover.spinRight();
	        assertEquals(EastDirection.class, rover.getDirection().getClass());
	    }

	    @Test
	    public void whenRequestedRoverCanSpinLeft() throws Exception {
	        rover.spinLeft();
	        assertEquals(WestDirection.class, rover.getDirection().getClass());
	    }

	    @Test
	    public void whenRequestedRoverCanMoveForward() throws Exception {
	        rover.moveForward();
	        assertEquals(++yCoordinate, rover.getCoordinateY());
	    }

	    @Test
	    public void whenRequestedRoverCanMoveBack() throws Exception {
	        rover.moveBack();
	        assertEquals(--yCoordinate, rover.getCoordinateY());
	    }

	    @Test
	    public void whenRequestedRoverCanPrintCurrentPosition() throws Exception {
	        assertEquals(xCoordinate + " "
	                + yCoordinate + " "
	                + direction.getClass().getSimpleName().charAt(0), rover.returnLocation());
	    }

	    @Test
	    public void whenRequestedRoverCanExecuteCommandAsAList() throws Exception {
	        ArrayList<Command> commandArrayList = new ArrayList<>();
	        commandArrayList.add(new MoveForwardCommand());
	        commandArrayList.add(new MoveForwardCommand());
	        commandArrayList.add(new SpinLeftCommand());
	        
	        cm.executeCommandList(commandArrayList);

	        assertEquals(2, rover.getCoordinateX());
	        assertEquals(4, rover.getCoordinateY());
	        assertEquals(WestDirection.class, rover.getDirection().getClass());
	    }

	   
}
