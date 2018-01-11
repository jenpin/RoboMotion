package controller.impl;


import controller.Command;
import model.Robot;
import service.CommandUtil;
import utils.RoboConstants;

import java.util.List;


public class Place implements Command {

    private int xPosition;
    private int yPosition;
    private String directionFacing;

    public int getxPosition() {
        return xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public String getDirectionFacing() {
        return directionFacing;
    }

    public void setFieldValues(String tokenList){
        List<String> tokens = CommandUtil.splitCommandByRegex ( tokenList,",");
        xPosition = Integer.parseInt (tokens.get(0));
        yPosition = Integer.parseInt (tokens.get(1));
        directionFacing = tokens.get(2);
    }

    @Override
    public void processCommand(Robot robot) {
        robot.setxPosition ( xPosition);
        robot.setyPosition ( yPosition);
        robot.setDirectionFacing ( RoboConstants.DIRECTION.valueOf ( directionFacing ) );
    }
}
