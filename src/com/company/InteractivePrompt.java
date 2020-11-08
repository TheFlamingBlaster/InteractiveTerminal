package com.company;

public class InteractivePrompt {
    public static String prompt(String userInfo, String[] acceptableValues) {
        boolean cont = true; // Should we prompt the user again?
        String uInfo = userInfo + " ("; // A formatted UserInfo prompt
        String response = ""; // Return value

        for (String acceptableValue: acceptableValues) {
            uInfo = uInfo + acceptableValue + "/"; // Format the string such that it shows all acceptable values.
        }
        uInfo = uInfo.substring(0, uInfo.length()-1) + ")?";
        System.out.println(uInfo);


        while(cont) {
            String input = InteractiveTerminal.getInput();
            for (String acceptableValue: acceptableValues) {
                if (acceptableValue.equals(input)) {
                    cont = false;
                    response = input;
                } else {
                    System.out.println();
                }
            }

        }

        return response;
    }
}
