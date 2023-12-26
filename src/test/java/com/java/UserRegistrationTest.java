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
        boolean check=user.userLastName();
        System.out.println(check);
        Assert.assertTrue(check);
    }
    @Test
    public void userEmail(){
        boolean check=user.email();
        System.out.println(check);
        Assert.assertTrue(check);
    }
    @Test
    public void phone(){
        boolean check=user.phoneNumber();
        System.out.println(check);
        Assert.assertTrue(check);
    }
    @Test
    public void password(){
        boolean check=user.userPassword();
        System.out.println(check);
        Assert.assertTrue(check);
    }
}
