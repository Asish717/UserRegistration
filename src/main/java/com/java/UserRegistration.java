package com.java;

public class UserRegistration {
    public boolean userFirstName(String firstName){
        return firstName.matches("[A-Z]{1}[a-z]{2,}");
    }
    public boolean userLastName(String lastName){
        return lastName.matches("[A-Z]{1}[a-z]{2,}");
    }
}
