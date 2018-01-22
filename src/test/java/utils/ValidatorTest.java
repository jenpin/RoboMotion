package utils;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidatorTest  {
    private Validator validate;

    @Before
    public void setUp() {
        validate = new Validator();
    }

    @Test
    public void isValidCommand_returnFalseforLowerCase() {
        String commandList = "move 123" ;
         assertFalse(validate.isValidCommand(commandList));
    }

    @Test
    public void isValidCommand_returnTrueforValidCommand() {
        String commandList =  "PLACE 123" ;
        assertTrue(validate.isValidCommand(commandList));
    }

    @Test
    public void isValidCommand_returnTrue() {
        assertTrue(validate.isValidCommand("MOVE"));
    }

    @Test
    public void isValidCommand_returnFalseforInvalid() {
       assertFalse(validate.isValidCommand("Hype"));
    }

    @Test
    public void validateMove_returnTrue() {
        assertTrue(validate.validateMove(-3));
    }

    @Test
    public void validateMove_returnFalseValid() {
        assertFalse(validate.validateMove(-6));
    }

    @Test
    public void validateMove_returnTrueBoundary() {
        assertTrue(validate.validateMove(5));
    }
}