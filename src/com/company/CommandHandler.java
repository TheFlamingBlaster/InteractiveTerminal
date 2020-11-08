package com.company;

public class CommandHandler {

    private Command[] commandListing; // all commands used in this project.

    public CommandHandler() {
        commandListing = new Command[] { // initialize every command registered. this is about as good as i can get it.
                new HelpCommand(),
                new ExitCommand(),
        };

    }

    public Command getCommand(String commandName) throws Exception {
        Command foundCmd = null;
        for (Command cmd: commandListing) {
            if (cmd.Command.equals(commandName)) { // Search for the command in the array.
                foundCmd = cmd;
            }
        }
        if (foundCmd == null) {
            throw new Exception("Command not found.");
        }

        return foundCmd;
    }

    public Command[] getCommands() {
        return commandListing.clone();
    }
}
