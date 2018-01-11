package utils;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

class ValidatorTest  {
    private static Validator validate;

    @Before
    static void setUp() {
        validate = new Validator ( );
    }

    @Test
    void isValidCommand_returnFalseforLowerCase() {
        String commandList = "move 123" ;
         assertFalse ( validate.isValidCommand ( commandList ) );
    }

    @Test
    void isValidCommand_returnTrueforValidCommand() {
        String commandList =  "PLACE 123" ;
        assertTrue ( validate.isValidCommand ( commandList ) );
    }

    @Test
    void isValidCommand_returnTrue() {
        assertTrue ( validate.isValidCommand ( "MOVE" ) );
    }

    @Test
    void isValidCommand_returnFalseforInvalid() {
       assertFalse ( validate.isValidCommand ( "Hype" ) );
    }

    @Test
    void validateMove_returnTrue() {
        assertTrue ( validate.validateMove ( -3 ) );
    }

    @Test
    void validateMove_returnFalseValid() {
        assertFalse ( validate.validateMove ( -6 ) );
    }

    @Test
    void validateMove_returnTrueBoundary() {
        assertTrue ( validate.validateMove ( 5 ) );
    }
}