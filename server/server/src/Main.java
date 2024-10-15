import managers.CollectionManager;
import managers.CommandManager;
import managers.FileManager;
import managers.RunManager;
import system.Server;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args){
        final Logger serverLogger = Logger.getLogger("logger");
        CommandManager commandManager = new CommandManager();
        CollectionManager collectionManager;
        RunManager runManager = new RunManager(commandManager);
        if (args.length != 0) {
            try{
                FileManager.read(args[0]);
            } catch (Exception e) {
                serverLogger.info("Autoloading error");
            }
            serverLogger.info("Successfull autoloading");
        } else {
            serverLogger.info("File was not found");
            System.exit(1);
        }

        Server server = new Server( 2448, runManager);
        server.run(args[0]);
    }
}