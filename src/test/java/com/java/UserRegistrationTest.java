package com.java;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration user=new UserRegistration();
    @Test
    public void nameFirst(){
        boolean check=user.userFirstName();
        System.out.println(check);
        Assert.assertTrue(check);
    }
    @Test
    public void nameLast(){
        try {
            boolean check=user.userLastName();
            System.out.println(check);
            Assert.assertTrue(check);
        }
        catch (UserRegistration.InvalidUserException e){
            throw new RuntimeException(e);
        }

    }
    @Test
    public void userEmail(){
        try {
            boolean check=user.email();
            System.out.println(check);
            Assert.assertTrue(check);
        }
        catch (UserRegistration.InvalidUserException e){
            throw new RuntimeException(e);
        }
    }
    @Test
    public void phone(){
        try {
            boolean check=user.phoneNumber();
            System.out.println(check);
            Assert.assertTrue(check);
        }
        catch (UserRegistration.InvalidUserException e){
            throw new RuntimeException(e);
        }
    }
    @Test
    public void password(){
        try {
            boolean check=user.userPassword("kumar1Dash#");
            System.out.println(check);
            Assert.assertTrue(check);
        }
        catch (UserRegistration.InvalidUserException e){
            throw new RuntimeException(e);
        }
    }
}
