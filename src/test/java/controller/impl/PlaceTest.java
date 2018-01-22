package controller.impl;

import model.Robot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static utils.RoboConstants.DIRECTION.EAST;
import static utils.RoboConstants.DIRECTION.WEST;

public class PlaceTest{

    public  Place place;
    @Before
    public void setUp() {
        place = new Place ();
    }

    @Test
    public void setValues() {
        place.setFieldValues( "1,-5,WEST" );
       assertEquals(-5,place.getyPosition () );
       assertEquals(1,place.getxPosition () );
       assertEquals("WEST" ,place.getDirectionFacing ());
    }

    @Test
    public void processCommand_WithValidScenarios() {
        place.setFieldValues("-2,3,EAST" );
        Robot robot = new Robot ();
        place.processCommand(robot );
        assertEquals(-2,robot.getxPosition () );
        assertEquals(3,robot.getyPosition () );
        assertEquals(EAST,robot.getDirectionFacing () );
    }

}