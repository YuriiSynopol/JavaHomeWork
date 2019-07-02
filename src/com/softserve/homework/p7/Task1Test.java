package com.softserve.homework.p7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Task1Test {

    @Test
    public void isContain(){
       //Arrange
        String a = "IT";
        String b = "IT Academy";

        //Assert
        Assert.assertTrue(b.contains(a));
    }
}
