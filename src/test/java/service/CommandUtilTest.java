package service;

import controller.Command;
import controller.impl.Move;
import controller.impl.Place;
import org.junit.Before;
import org.junit.Test;
import utils.RoboConstants.*;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertSame;
import static org.junit.Assert.*;

public class CommandUtilTest {
    private  CommandUtil commandUtil;
    @Before
    public void setUp() {
        commandUtil = new CommandUtil ();
    }

    @Test
    public void splitCommandByRegex_CommandPlaceAndRegexSpace() {
        List<String> tokenList = commandUtil.splitCommandByRegex("PLACE 1,2,3"," " );
        assertEquals(2,tokenList.size () );
        assertArrayEquals (new String[] {"PLACE","1,2,3"},tokenList.toArray ());

    }


    @Test
    public void splitCommandByRegex_RegexComma() {
        List <String> tokenList = commandUtil.splitCommandByRegex("1,2,3","," );
        assertEquals(3,tokenList.size () );
        assertArrayEquals (new String[] {"1","2","3"},tokenList.toArray ());
    }

    @Test
    public void getCommand_validscenario() {
        Commands command = commandUtil.getCommand("MOVE" );
        assertNotNull(command );
        assertSame( Commands.MOVE,command);
    }

    @Test
    public void getCommand_validPLACEScenario() {
        Commands command = commandUtil.getCommand("PLACE 1,2,SOUTH" );
        assertSame( Commands.PLACE,command);
    }


    @Test
    public void getCommandObject_validPLACEScenario() {
        Command command = commandUtil.getCommandObject("PLACE 1,2,SOUTH" );
        assertNotNull(command );
        assertTrue(command instanceof Place );
    }

    @Test
    public void getCommandObject_validMOVEScenario() {
        Command command;
        command = commandUtil.getCommandObject("MOVE ");
        assertNotNull(command );
        assertTrue(command instanceof Move );
    }
}