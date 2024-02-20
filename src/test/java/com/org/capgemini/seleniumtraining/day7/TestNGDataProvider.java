package com.org.capgemini.seleniumtraining.day7;

import com.beust.jcommander.Parameter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGDataProvider {


   // @Test(dataProvider = "mytestData")
    public void m1(String browser_name){
        String website_url = "https://www.selenium.dev/selenium/web/dynamic.html";
        //FirefoxOptions firefoxOptions = new FirefoxOptions();
        WebDriver driver = null;
        switch (browser_name){
            case "firefox":
                driver = new FirefoxDriver();
                break;

            case "chrome":
                driver = new ChromeDriver();
                break;

            case "edge":
                driver = new EdgeDriver();
                break;

            default:
                System.out.println(" dude ... check what u have given");
        }
        driver.get(website_url);
    }




    @Test
    @Parameters("browser_name")
    public void parametrizationWithTestNgXML(String browser_name) throws Exception{
        String website_url = "https://www.selenium.dev/selenium/web/dynamic.html";
        //FirefoxOptions firefoxOptions = new FirefoxOptions();

        System.out.println("browser_name :: "+browser_name);
        WebDriver driver = null;
        switch (browser_name){
            case "firefox":
                driver = new FirefoxDriver();
                break;

            case "chrome":
                driver = new ChromeDriver();
                break;

            case "edge":
                driver = new EdgeDriver();
                break;

            default:
                System.out.println(" dude ... check what u have given");
        }
        driver.get(website_url);
    }


    @DataProvider
    public Object[] mytestData(){

        Object[]  testdata = new Object[3];
        testdata[0] = "chrome";
        testdata[1] = "firefox";
        testdata[2] = "edge";
         return  testdata;
    }

}
