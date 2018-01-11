package controller.impl;

import model.Robot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

class PlaceTest{

    private static Place place;
    @Before
    static void setUp() {
        place = new Place ();
    }

    @Test
    void setValues() {
        place.setFieldValues( "1,-5,WEST" );
       assertEquals(place.getyPosition (),-5 );
       assertEquals(place.getxPosition (),1 );
       assertEquals(place.getDirectionFacing (),"WEST" );
    }

    @Test
    void processCommand_WithValidScenarios() {
        place.setFieldValues("-2,3,EAST" );
        Robot robot = new Robot ();
        place.processCommand(robot );
        assertEquals(-2,robot.getxPosition () );
        assertEquals(3,robot.getyPosition () );
        assertEquals("EAST",robot.getDirectionFacing () );

    }

}