package com.company;

public class TestUpdateMethod extends UpdateMethod { // Whenever a command is executed in the terminal, an UpdateMethod can be binded to run afterwards.
    @Override
    public void Run() {
        System.out.println("Update!!!!");
    }
}
