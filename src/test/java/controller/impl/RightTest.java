package controller.impl;


import model.Robot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static utils.RoboConstants.DIRECTION.*;


public class RightTest{
     private Right right;

    @Before
    public void setUp() {
        right = new Right ();
    }

    @Test
    public void processCommand_RightFacingWest() {
        Robot robot = new Robot ();
        robot.setyPosition(3 );
        robot.setxPosition(-2 );
        robot.setDirectionFacing(WEST);
        right.processCommand(robot );
        assertEquals(-2,robot.getxPosition () );
        assertEquals(3,robot.getyPosition () );
        assertEquals(NORTH,robot.getDirectionFacing () );

    }

    @Test
    public void processCommand_RightFacingEast() {
        Robot robot = new Robot ();
        robot.setyPosition(3 );
        robot.setxPosition(-2 );
        robot.setDirectionFacing(EAST);
        right.processCommand(robot );
        assertEquals(-2,robot.getxPosition () );
        assertEquals(3,robot.getyPosition () );
        assertEquals(SOUTH,robot.getDirectionFacing () );

    }

    @Test
    public void processCommand_RightFacingNorth() {
        Robot robot = new Robot ();
        robot.setyPosition(3 );
        robot.setxPosition(-2 );
        robot.setDirectionFacing(NORTH);
        right.processCommand(robot );
        assertEquals(-2,robot.getxPosition () );
        assertEquals(3,robot.getyPosition () );
        assertEquals(EAST,robot.getDirectionFacing () );

    }

    @Test
    public void processCommand_RightFacingSouth() {
        Robot robot = new Robot ();
        robot.setyPosition(3 );
        robot.setxPosition(-2 );
        robot.setDirectionFacing(SOUTH);
        right.processCommand(robot );
        assertEquals(-2,robot.getxPosition () );
        assertEquals(3,robot.getyPosition () );
        assertEquals(WEST,robot.getDirectionFacing () );

    }


}