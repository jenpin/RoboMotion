package service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class CsvFileReader implements FileReader {
    String defaultFile = "src/main/resources/defaultInputFile";

    @Override
    public List<String> readFile(String fileName) {
        fileName = ((fileName != null && !fileName.isEmpty ()) ? fileName : defaultFile );
        List<String> commandList = new ArrayList<>();

        try {
            Iterator<String> iter = Files.lines(Paths.get(fileName)).iterator();
            while (iter.hasNext()) {
                commandList.add(iter.next() );
            }
        } catch(IOException e ) {
            e.printStackTrace();
        }
        return commandList;
    }
}
