package com.org.capgemini.seleniumtraining.day5;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsDemo {

    @Test
    public void m1(){

        SoftAssert softAssert = new SoftAssert();

        //Assert hardAssert = new SoftAssert();
        //softAssert.assertEquals("Apparels and  Accessories","  Apparel & accessories","the given two text message's doesn't match");
        //softAssert.assertEquals("  Makeup","Makeup","xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        softAssert.assertEquals("Apparels and  Accessories","  Apparel & accessories","the given two text message's doesn't match");
        softAssert.assertEquals("  Makeup","Makeup","xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        softAssert.assertAll("releasing the results out");


    }
}
