package controller.impl;


import controller.Command;
import model.Robot;
import utils.RoboConstants;

import static utils.RoboConstants.*;

public class Left implements Command {

    @Override
    public void processCommand(Robot robot) {

        switch (robot.getDirectionFacing ( )) {
            case NORTH:
                robot.setDirectionFacing ( RoboConstants.DIRECTION.WEST );
                break;
            case SOUTH:
                robot.setDirectionFacing ( DIRECTION.EAST );
                break;
            case EAST:
                robot.setDirectionFacing ( DIRECTION.NORTH );
                break;
            case WEST:
                robot.setDirectionFacing ( DIRECTION.SOUTH );
                break;
        }
    }

}
