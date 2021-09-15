package com.BridgeLabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Program!");
        UserInput user = new UserInput();
        user.fName("Achintya");
        user.lName("Tiwari");
    }

    public static class UserInput {
        public void fName(String fName) {
            String regex = "^[A-Z]{1}[a-z]{2,}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(fName);
            boolean valid = matcher.matches();
            if (valid == true) {
                System.out.println(fName + " is Valid");
            } else {
                System.out.println(fName + " is Invalid");
            }
        }

        public void lName(String lName) {
            String regex = "^[A-Z]{1}[a-z]{2,}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(lName);
            boolean valid = matcher.matches();
            if (valid == true) {
                System.out.println(lName + " is Valid");
            } else {
                System.out.println(lName + " is Invalid");
            }
        }
    }
}
