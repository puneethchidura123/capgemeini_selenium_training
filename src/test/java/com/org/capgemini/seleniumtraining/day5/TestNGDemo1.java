package com.org.capgemini.seleniumtraining.day5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo1 {

    @Test
    public void simpleTestCase(){

        int a = 1;
        int b = 2;

        System.out.println("from TestNGDemo1 class");
        Assert.assertEquals(1+2,3);
    }
}
