import model.Robot;
import service.CommandUtil;
import service.CsvFileReader;
import utils.Validator;

import java.util.List;

public class RoboCopEntryPoint {

    public void processFile(String commandFile){
        CsvFileReader csvFileReader = new CsvFileReader ();
        Validator validate = new Validator ();
        CommandUtil commandUtil = new CommandUtil ();
        commandUtil.setPlaceCommand(false );
        Robot robot = new Robot();

        List<String> commandList = csvFileReader.readFile(commandFile );
        for(String fileCommand : commandList){
            if (validate.isValidCommand(fileCommand ) && commandUtil.isPlaceCommand ()){
                commandUtil.getCommandObject(fileCommand ).processCommand(robot );
            }
        }

    }

    public static void main(String[] args) {
        RoboCopEntryPoint entryPoint = new RoboCopEntryPoint ();

        if(args.length == 1){
            entryPoint.processFile(args[0]);

        }else{
            System.out.println (" A single argument is required. Only the input command file is expected ." );
        }
    }
}
