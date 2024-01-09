package com.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public class InvalidUserException extends Exception{
        InvalidUserException(String s){
            super(s);
        }
    }
    public boolean userFirstName(){
        Pattern p= Pattern.compile("[A-Z]{1}[a-z]{2,}");
        Matcher m=p.matcher("Asish");
        return m.matches();
    }
    public boolean userLastName() throws InvalidUserException{
        if (Pattern.compile("[A-Z]{1}[a-z]{2,}").matcher("Dash").matches()){
            return true;
        }
        else {
            throw new InvalidUserException("Invalid last name");
        }
        //return lastName.matches("[A-Z]{1}[a-z]{2,}");
    }
    public boolean email() throws InvalidUserException{
        if (Pattern.compile("[a-zA-Z0-9._&*]+@[a-z]{2,}\\.[a-z]{2,}")
                .matcher("asish717@gmail.com").matches()){
            return true;
        }
        else {
            throw new InvalidUserException("Invalid email");
        }
    }
    public boolean phoneNumber()throws InvalidUserException{
        if (Pattern.compile("[0-9]{1,3} [0-9]{10}")
                .matcher("91 8297760717").matches()){
            return true;
        }
        else {
            throw new InvalidUserException("Invalid phone number");
        }
    }
    public boolean userPassword(String pass) throws InvalidUserException{
        if (pass.length() < 8) {
            throw new InvalidUserException("Invalid Password: Password should be at least 8 characters long");
        }

        // Count the number of uppercase letters, numbers, and special characters
        long uppercaseCount = pass.chars().filter(Character::isUpperCase).count();
        long digitCount = pass.chars().filter(Character::isDigit).count();
        long specialCharCount = pass.chars().filter(ch -> "[!@#$%&*()_+]".indexOf(ch) != -1).count();

        // Ensure there is at least one uppercase letter, at least one number, and exactly one special character
        if (uppercaseCount < 1 || digitCount < 1 || specialCharCount != 1) {
            throw new InvalidUserException("Invalid Password: Password should be at least 8 characters long, contain at least one uppercase letter, at least one number, and exactly one special character");
        }

        return true;
    }
    public boolean emailSample(String email){
        boolean isValidEmail=email.matches("[a-zA-Z0-9._&*+-]+@[a-z0-9.]{1,}\\.[a-z]{2,}");
            if (isValidEmail==false){
                System.out.println("not valid");
            }
            return isValidEmail;
    }
}
