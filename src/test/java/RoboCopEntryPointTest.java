import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import utils.Validator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class RoboCopEntryPointTest{

    private RoboCopEntryPoint entrypoint;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream ();

    @Before
    public void setUp() {
        entrypoint = new RoboCopEntryPoint ();
        System.setOut(new PrintStream (outContent));
    }

    @Test
    public void processFile_5_5_WEST() {
        String filename = "src/main/resources/defaultInputFile";
         entrypoint.processFile ( filename );
        assertEquals("Robot Position : 5 , 5 , WEST", outContent.toString().trim ());
    }

    @Test
    public void processFile_no_PLACE() {
        String filename = "src/main/resources/noPlaceFile";
        entrypoint.processFile ( filename );
        assertEquals("", outContent.toString().trim ());
    }

}