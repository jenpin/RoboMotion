package controller.impl;


import model.Robot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


class MoveTest  {
    private static Move move;

    @Before
    static void setUp() {
        move = new Move ();
    }

    @Test
    void processCommand_robotFacingNorth() {
        Robot robot = new Robot ();
        robot.setyPosition ( 3 );
        robot.setxPosition ( -2 );
        robot.setDirectionFacing ( "NORTH");
        move.processCommand ( robot );
        assertEquals ( -2,robot.getxPosition () );
        assertEquals ( 4,robot.getyPosition () );
        assertEquals ( "NORTH",robot.getDirectionFacing () );
    }

    @Test
    void processCommand_robotFacingSouth() {
        Robot robot = new Robot ();
        robot.setyPosition ( 3 );
        robot.setxPosition ( -2 );
        robot.setDirectionFacing ( "SOUTH");
        move.processCommand ( robot );
        assertEquals ( -2,robot.getxPosition () );
        assertEquals ( 2,robot.getyPosition () );
        assertEquals ( "SOUTH",robot.getDirectionFacing () );
    }

    @Test
    void processCommand_robotFacingEast() {
        Robot robot = new Robot ();
        robot.setyPosition ( 3 );
        robot.setxPosition ( -2 );
        robot.setDirectionFacing ( "EAST");
        move.processCommand ( robot );
        assertEquals ( -1,robot.getxPosition () );
        assertEquals ( 3,robot.getyPosition () );
        assertEquals ( "EAST",robot.getDirectionFacing () );
    }

    @Test
    void processCommand_robotFacingWest() {
        Robot robot = new Robot ();
        robot.setyPosition ( 3 );
        robot.setxPosition ( -2 );
        robot.setDirectionFacing ( "WEST");
        move.processCommand ( robot );
        assertEquals ( -3,robot.getxPosition () );
        assertEquals ( 3,robot.getyPosition () );
        assertEquals ( "WEST",robot.getDirectionFacing () );
    }


}