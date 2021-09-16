package com.BridgeLabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Program!");
        UserInput user = new UserInput();
        user.fName("Achintya");
        user.lName("tiwari");
        user.eaddress("achintyatiwari165@gmail.com");
        user.mobNo("91 8109750567");
        user.passRule1(ABCjk123);
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
        public void eaddress(String eaddress){
            String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(eaddress);
            boolean valid=matcher.matches();
            if (valid==true){
                System.out.println(eaddress+" is Valid");
            }
            else{
                System.out.println(eaddress+" is Invalid");
            }
        }
        public void mobNo(String mobNo) {
            String regex = "^[0-9]{2} [6-9]{1}[0-9]{9}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(mobNo);
            boolean valid = matcher.matches();
            if (valid == true) {
                System.out.println("Your Phone Number " + mobNo + " is Valid");
            } else {
                System.out.println("Your Phone Number " +mobNo + " is Invalid");
            }
        }
        public void passRule1(String passRule1) {
            String regex = "^[0-9a-zA-Z]{8}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(passRule1);
            boolean valid = matcher.matches();
            if (valid == true) {
                System.out.println( passRule1 + " is Valid");
            } else {
                System.out.println( passRule1 + " is Invalid");
            }
        }
    }
}
