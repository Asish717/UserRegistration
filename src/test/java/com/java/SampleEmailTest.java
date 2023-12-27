package com.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SampleEmailTest {
    UserRegistration user=new UserRegistration();
    @ParameterizedTest
    @CsvSource({
            "abc@yahoo.com",
            "abc-100@yahoo.com",
            "abc.100@yahoo.com",
            "abc111@abc.com",
            "abc-100@abc.net",
            "abc.100@abc.com.au",
            "abc@1.com",
            "abc@gmail.com.com",
            "abc+100@gmail.com"
    })
    void test(String email){
        boolean check=user.emailSample(email);
        System.out.println(check);
        Assertions.assertTrue(check);
    }
}
