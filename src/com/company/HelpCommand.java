package com.company;


public class HelpCommand extends Command {

    public static String _Command = "help"; // What the user needs to type in to execute the command.
    public static Object[] _ExpectedArguments = {}; // A list of expected object arguments, if the typing of the arguments
    public static String _CommandDescription = Globals.HELP_COMMAND_DESCRIPTION; // command description.

    public HelpCommand() {
        this.Command = _Command;
        this.ExpectedArguments = _ExpectedArguments;
        this.CommandDescription = _CommandDescription;
    }

    @Override
    public void Run(CommandHandler cmdHandler, String[] arguments)  {
        Command[] allCommands = cmdHandler.getCommands();
        System.out.println(Globals.LISTING_DESCRIPTION);
        for (Command cmd: allCommands) {
            System.out.println(cmd.Command + " - " + cmd.CommandDescription);
        }
    }
}
