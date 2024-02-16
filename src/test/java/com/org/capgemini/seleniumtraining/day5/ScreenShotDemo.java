package com.org.capgemini.seleniumtraining.day5;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

import static com.org.capgemini.seleniumtraining.day3.NavigationDemo.waitfosometime;

public class ScreenShotDemo {


    @Test
    public void screenshotDemo() throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String website_url = "https://demo.automationtesting.in/Register.html";
        driver.get(website_url);
        waitfosometime(2000);


        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File automationtesting_screen_cpature =  takesScreenshot.getScreenshotAs(OutputType.FILE);

        File file1 = new File("C:\\Users\\DSK\\IdeaProjects\\capgemeini_selenium_training\\Screencaptures\\screenshot.png");


        FileUtils.copyFile(automationtesting_screen_cpature,file1);


    }
}
