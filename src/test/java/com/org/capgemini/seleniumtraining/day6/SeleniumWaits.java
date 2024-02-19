package com.org.capgemini.seleniumtraining.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.org.capgemini.seleniumtraining.day3.NavigationDemo.waitfosometime;

public class SeleniumWaits {

    @Test
    public void waitsDemo(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String website_url = "https://www.selenium.dev/selenium/web/dynamic.html";
        driver.get(website_url);

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));

        //WebDriverWait webDriverWait = new WebDriverWait(driver,Duration.ofSeconds(10));

        FluentWait fluentWait = new FluentWait(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofMillis(200));



        //waitfosometime(2000);


      WebElement reveal_a_new_input = driver.findElement(By.id("reveal"));
        reveal_a_new_input.click();


        WebElement text_box = driver.findElement(By.id("revealed"));

        //webDriverWait.until(ExpectedConditions.visibilityOf(text_box));
        fluentWait.until(ExpectedConditions.visibilityOf(text_box));
        text_box.sendKeys("hello....");

    }
}
