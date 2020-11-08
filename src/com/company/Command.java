package com.company;

public class Command {
    public String Command = ""; // What the user needs to type in to execute the command.
    public Object[] ExpectedArguments = {}; // A list of expected object arguments, if the typing of the arguments matter.
    public String CommandDescription = Globals.DEFAULT_COMMAND_DESCRIPTION; // A description for when people get lazy.

    public void Run(CommandHandler cmdHandler, String[] arguments) {};

}
