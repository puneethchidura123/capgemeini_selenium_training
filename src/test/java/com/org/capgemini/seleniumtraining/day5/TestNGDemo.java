package com.org.capgemini.seleniumtraining.day5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo {

    @Test(priority = -784)
    public void simpleTestCase1(){

        int a = 1;
        int b = 2;
        System.out.println("from TestNGDemo class - 1 ** negative priority");
        Assert.assertEquals(1+2,3);
    }

    @Test(priority = 2)
    public void simpleTestCase7(){

        int a = 1;
        int b = 2;
        System.out.println("from TestNGDemo class -7");
        Assert.assertEquals(1+2,3);
    }

    @Test(priority = 3)
    public void simpleTestCase3(){

        int a = 1;
        int b = 2;
        System.out.println("from TestNGDemo class - 3");
        Assert.assertEquals(1+2,3);
    }

    @Test(priority = 1)
    public void simpleTestCase4(){

        int a = 1;
        int b = 2;
        System.out.println("from TestNGDemo class  - 4");
        Assert.assertEquals(1+2,3);
    }

    @Test(priority = 4)
    public void simpleTestCase5(){

        int a = 1;
        int b = 2;
        System.out.println("from TestNGDemo class - 5");
        Assert.assertEquals(1+2,3);
    }
}
