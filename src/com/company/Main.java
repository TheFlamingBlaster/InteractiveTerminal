package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(Globals.WELCOME_MESSAGE);

        InteractiveTerminal app = new InteractiveTerminal();

        // You can add update methods which execute on every command. They might update the screen or other variables once you type in a command.
        // For instance, a partition management application may update the current state of your drive after you add or remove a partition.
        // For the constraints of this demo, it doesn't really need to be used.

        /*/
            app.SetUpdateMethods(new UpdateMethod[] {
                    new TestUpdateMethod(),
            });
        */


        app.StartInteractive();
    }
}
