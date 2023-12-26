package com.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public boolean userFirstName(){
        Pattern p= Pattern.compile("[A-Z]{1}[a-z]{2,}");
        Matcher m=p.matcher("Asish");
        return m.matches();
    }
    public boolean userLastName(){
        return Pattern.compile("[A-Z]{1}[a-z]{2,}").matcher("Dash").matches();
    }
    public boolean email(){
        return Pattern.compile("[a-zA-Z0-9._&*]+@[a-z]{2,}\\.[a-z]{2,}")
                .matcher("asish717@gmail.com").matches();
    }
}
