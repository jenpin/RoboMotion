package controller.impl;


import model.Robot;
import org.junit.BeforeClass;
import org.junit.Test;
import utils.RoboConstants;


import static org.junit.Assert.assertEquals;
import static utils.RoboConstants.DIRECTION.*;


class LeftTest{
    private static Left left;

    @BeforeClass
    public  void setUp() {
        left = new Left();
    }

    @Test
    public  void processCommand_LeftFacingWest() {
        Robot robot = new Robot ();
        robot.setyPosition(3 );
        robot.setxPosition(-2 );
        robot.setDirectionFacing(WEST);
        left.processCommand(robot );
        assertEquals(-2,robot.getxPosition () );
        assertEquals(3,robot.getyPosition () );
        assertEquals(SOUTH,robot.getDirectionFacing () );

    }

    @Test
    public void processCommand_LeftFacingEast() {
        Robot robot = new Robot ();
        robot.setyPosition(3 );
        robot.setxPosition(-2 );
        robot.setDirectionFacing(EAST);
        left.processCommand(robot );
        assertEquals(-2,robot.getxPosition () );
        assertEquals(3,robot.getyPosition () );
        assertEquals(NORTH,robot.getDirectionFacing () );
    }

    @Test
    public void processCommand_LeftFacingNorth() {
        Robot robot = new Robot ();
        robot.setDirectionFacing(NORTH);
        left.processCommand(robot );
        assertEquals(WEST,robot.getDirectionFacing () );

    }

    @Test
    public void processCommand_LeftFacingSouth() {
        Robot robot = new Robot ();
        robot.setDirectionFacing(SOUTH);
        left.processCommand(robot );
        assertEquals("EAST",robot.getDirectionFacing () );

    }

}