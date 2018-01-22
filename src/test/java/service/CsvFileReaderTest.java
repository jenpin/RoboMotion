package service;


import org.junit.Before;
import org.junit.Test;


import java.util.List;

import static org.junit.Assert.assertEquals;


public class CsvFileReaderTest {

    private CsvFileReader reader;

    @Before
    public void setUp() {
        reader = new CsvFileReader ();
    }


    @Test
    public void readFile_shouldReturnListSize12() {
       List <String> outputList = reader.readFile("src/main/resources/basicInputFile" );
       assertEquals(12,outputList.size () );
    }

    @Test
    public void readFile_shouldReturnDefaultListSize6() {
        List <String> outputList = reader.readFile("" );
        assertEquals(6,outputList.size () );
    }

    @Test
    public void readFile_shouldReturnDefaultNullListSize6() {
        List <String> outputList = reader.readFile(null );
        assertEquals(6,outputList.size () );
    }

}