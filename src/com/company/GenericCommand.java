package com.company;


public class GenericCommand extends Command {

    public static String _Command = "command-name-here"; // What the user needs to type in to execute the command.
    public static Object[] _ExpectedArguments = {}; // A list of expected object arguments, if the typing of the arguments
    public static String _CommandDescription = Globals.DEFAULT_COMMAND_DESCRIPTION; // command description.

    public GenericCommand() {
        this.Command = _Command;
        this.ExpectedArguments = _ExpectedArguments;
        this.CommandDescription = _CommandDescription;
    }

    @Override
    public void Run(CommandHandler cmdHandler, String[] arguments)  {
        System.out.println("Hello from " + this.Command);
    }
}
