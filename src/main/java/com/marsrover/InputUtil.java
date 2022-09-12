package com.marsrover;


import java.util.ArrayList;

import com.marsrover.Command.Command;
import com.marsrover.Command.CommandMap;
import com.marsrover.Direction.DirectionMap;
import com.marsrover.Rover.Rover;

public class InputUtil {
	

    public static Plateau createPlateauInput(int plateauUpperBoundCoordinateX,int plateauUpperBoundCoordinateY ) {
        
        return new Plateau(plateauUpperBoundCoordinateX, plateauUpperBoundCoordinateY);
    }

    public static Rover createPositionInput(int x,int y,String direction, Plateau plateau) {
        
        
        return new Rover(plateau, x, y, DirectionMap.valueOf(direction).getDirection());
    }

    public static ArrayList<Command> createCommandInput(String command) {
        char[] inputArray = command.toCharArray();
        ArrayList<Command> commandArrayList = new ArrayList<>();

        for (char character : inputArray) {
            Command currentCommand = CommandMap.valueOf(Character.toString(character)).getCommand();
            commandArrayList.add(currentCommand);
        }

        return commandArrayList;
    }

}
