package service;


import org.junit.Before;
import org.junit.Test;


import java.util.List;

import static org.junit.Assert.assertEquals;


class CsvFileReaderTest {

    private static CsvFileReader reader;

    @Before
    static void setUp() {
        reader = new CsvFileReader ();
    }


    @Test
    void readFile_shouldReturnListSize12() {
       List <String> outputList = reader.readFile ( "/src/com/pintoj4/resources/data/basicInputFile" );
       assertEquals ( 12,outputList.size () );
    }

    @Test
    void readFile_shouldReturnDefaultListSize6() {
        List <String> outputList = reader.readFile ( "" );
        assertEquals ( 6,outputList.size () );
    }

    @Test
    void readFile_shouldReturnDefaultNullListSize6() {
        List <String> outputList = reader.readFile ( null );
        assertEquals ( 6,outputList.size () );
    }

}