package com.java;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration user=new UserRegistration();
    @Test
    public void nameFirst(){
        boolean check=user.userFirstName("Asish");
        System.out.println(check);
        Assert.assertTrue(check);
    }
    @Test
    public void nameLast(){
        boolean check=user.userLastName("Dash");
        System.out.println(check);
        Assert.assertTrue(check);
    }
}
