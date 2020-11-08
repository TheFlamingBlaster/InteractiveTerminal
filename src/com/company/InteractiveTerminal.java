package com.company;

import java.io.IOException;

public class InteractiveTerminal {
    private UpdateMethod[] updateMethods = new UpdateMethod[] {};

    public static void out(String str) {
        System.out.println(str);
    }

    public static String getInput() {
        String output = "";
        boolean cont = true;
        while (cont) {
            try {
               int charInt = System.in.read();
               if (charInt != 10) {
                   output = output + (char) charInt;
               } else {
                   cont = false;
               }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return output;
    }

    private void runUpdateMethods() {
        for (UpdateMethod method: updateMethods) {
            method.Run();
        }
    }

    public void StartInteractive() {
        CommandHandler cmdHandler = new CommandHandler();
        runUpdateMethods();
        while (true) {
            String input = getInput();
            String[] arguments = input.split(" ");

            try {
                Command currentCmd = cmdHandler.getCommand(arguments[0]);
                currentCmd.Run(cmdHandler, arguments);
                runUpdateMethods();
            } catch (Exception e) {
                out(Globals.NOT_FOUND_ERROR);
            }
        }
    }

    public void SetUpdateMethods(UpdateMethod[] methods) {
        updateMethods = methods;
    }

    public InteractiveTerminal() {

    }
}
