package controller.impl;


import controller.Command;
import model.Robot;

public class Report implements Command {
    @Override
    public void processCommand(Robot robot) {
        System.out.println ("Robot Position : "+ robot.getxPosition () +" , "+ robot.getyPosition ()+" , "+robot.getDirectionFacing ());
    }
}
