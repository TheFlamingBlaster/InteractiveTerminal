package com.company;

public class Globals {
    // Application
    public static final String APPLICATION_NAME = "Terminal Application";
    public static final boolean CONFIRM_ON_EXIT = true;

    // Messages
    public static final String HELP_COMMAND_NAME = "help";
    public static final String WELCOME_MESSAGE = "Welcome to " + APPLICATION_NAME + "! Type in " + HELP_COMMAND_NAME + " for a listing of commands.";

    // Command Descriptions

    public static final String DEFAULT_COMMAND_DESCRIPTION = "No description listed.";
    public static final String HELP_COMMAND_DESCRIPTION = "Displays this menu";
    public static final String EXIT_COMMAND_DESCRIPTION = "Exits the application";

    // Command Messages

    public static final String LISTING_DESCRIPTION = "List of commands for " + APPLICATION_NAME + ".";
    public static final String CONFIRM_EXIT_PROMPT = "Are you sure you want to exit " + APPLICATION_NAME;

    // Error Messages
    public static final String NOT_FOUND_ERROR = "Command not found.";
}
