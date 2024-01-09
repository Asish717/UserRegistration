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
    public boolean userPassword() throws InvalidUserException{
        if (Pattern.compile("(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*]).{8,}").matcher("kumar1Dash#").matches()){
            return true;
        }
        else {
            throw new InvalidUserException("Invalid password");
        }
    }
    public boolean emailSample(String email){
        boolean isValidEmail=email.matches("[a-zA-Z0-9._&*+-]+@[a-z0-9.]{1,}\\.[a-z]{2,}");
            if (isValidEmail==false){
                System.out.println("not valid");
            }
            return isValidEmail;
    }
}
