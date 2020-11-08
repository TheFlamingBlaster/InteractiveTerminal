package com.company;


public class ExitCommand extends Command {

    public static String _Command = "exit"; // What the user needs to type in to execute the command.
    public static Object[] _ExpectedArguments = {}; // A list of expected object arguments, if the typing of the arguments
    public static String _CommandDescription = Globals.EXIT_COMMAND_DESCRIPTION; // command description.

    public ExitCommand() {
        this.Command = _Command;
        this.ExpectedArguments = _ExpectedArguments;
        this.CommandDescription = _CommandDescription;
    }

    @Override
    public void Run(CommandHandler cmdHandler, String[] arguments)  {
        if (Globals.CONFIRM_ON_EXIT) {
            String confirmation = InteractivePrompt.prompt(Globals.CONFIRM_EXIT_PROMPT, new String[] {"Y", "N"});
            if (confirmation.equals("Y")) {
                System.exit(0);
            }
        } else {
            System.exit(0);
        }
    }
}
