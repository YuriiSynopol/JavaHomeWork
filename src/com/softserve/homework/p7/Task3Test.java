package com.softserve.homework.p7;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3Test {

    @Test

    public void checkTest() {
        //Arrange
        String a = "Vasya1234";
        String b = "Max_43$";

        //Assert
        Assert.assertTrue(a.matches("[a-zA-Z-_0-9]{3,15}$"));
        //fail
        Assert.assertTrue(b.matches("[a-zA-Z-_0-9]{3,15}$"));
    }


}
