package com.marsrover;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.marsrover.Command.MoveBackCommandTest;
import com.marsrover.Command.MoveForwardCommandTest;
import com.marsrover.Command.SpinLeftCommandTest;
import com.marsrover.Command.SpinRightCommandTest;
import com.marsrover.Direction.EastDirectionTest;
import com.marsrover.Direction.NorthDirectionTest;
import com.marsrover.Direction.SouthDirectionTest;
import com.marsrover.Direction.WestDirectionTest;
import com.marsrover.Rover.RoverExceptionTest;
import com.marsrover.Rover.RoverTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        MoveBackCommandTest.class,
        MoveForwardCommandTest.class,
        SpinLeftCommandTest.class,
        SpinRightCommandTest.class,
        EastDirectionTest.class,
        NorthDirectionTest.class,
        SouthDirectionTest.class,
        WestDirectionTest.class,
        RoverTest.class,
        RoverExceptionTest.class,
})
public class MarsRoverTestSuite extends BaseTest{

}
