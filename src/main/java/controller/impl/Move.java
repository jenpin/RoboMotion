package controller.impl;


import controller.Command;
import model.Robot;
import utils.Validator;

import static utils.RoboConstants.*;



public class Move implements Command {

    Validator validate = new Validator();

    @Override
    public void processCommand(Robot robot) {

        int currentXPosition = robot.getxPosition();
        int currentYPosition = robot.getyPosition();

        switch (robot.getDirectionFacing()) {
            case NORTH:
                calculateYPosition(robot, currentYPosition + 1 );
                break;
            case SOUTH:
                calculateYPosition(robot, currentYPosition - 1 );
                break;
            case EAST:
                calculateXPosition(robot, currentXPosition + 1 );
                break;
            case WEST:
                calculateXPosition(robot, currentXPosition - 1 );
                break;
        }
    }

    public void calculateYPosition(Robot robot, int move) {
        if (validate.validateMove(move )) {
            robot.setyPosition(move );
        }
    }

    public void calculateXPosition(Robot robot, int move) {
        if (validate.validateMove(move )) {
            robot.setxPosition(move );
        }

    }
}

