package com.marsrover;

import java.util.ArrayList;
import java.util.Scanner;

import com.marsrover.Command.Command;
import com.marsrover.Command.CommandManager;
import com.marsrover.Rover.Rover;

public class MarsRover {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Insert horizontal map size:");
        int sizex = reader.nextInt();
        System.out.println("Insert vertical map size:");
        int sizey = reader.nextInt();

        System.out.println("Insert horizontal initial rover position:");
        int roverx = reader.nextInt();
        System.out.println("Insert vertical initial rover position:");
        int rovery = reader.nextInt();
        System.out.println("Insert initial rover direction:");
        String roverz = reader.next(); //n = north, e = east, w = west, s = south
        
        System.out.println("Insert command (f = forward, b = backward, l = turn left, r = turn right):");
        String command = reader.next();

       
        Plateau plateu=InputUtil.createPlateauInput(sizex, sizey);
        Rover rover=InputUtil.createPositionInput(roverx,rovery,roverz,plateu);
        ArrayList<Command> commands=InputUtil.createCommandInput(command);
        CommandManager cManager=new CommandManager(rover);
        
        cManager.executeCommandList(commands);
        System.out.println(rover.returnLocation());
    }
}
