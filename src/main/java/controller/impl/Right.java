package controller.impl;


import controller.Command;
import model.Robot;

import static utils.RoboConstants.*;

public class Right implements Command {
    @Override
    public void processCommand(Robot robot) {
        switch (robot.getDirectionFacing()) {
            case NORTH:
                robot.setDirectionFacing(DIRECTION.EAST);
                break;
            case SOUTH:
                robot.setDirectionFacing(DIRECTION.WEST);
                break;
            case EAST:
                robot.setDirectionFacing(DIRECTION.SOUTH);
                break;
            case WEST:
                robot.setDirectionFacing(DIRECTION.NORTH);
                break;
        }
    }
}
