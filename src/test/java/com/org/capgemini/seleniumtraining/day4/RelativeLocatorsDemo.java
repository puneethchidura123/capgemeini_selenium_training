package com.org.capgemini.seleniumtraining.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import static com.org.capgemini.seleniumtraining.day3.NavigationDemo.waitfosometime;

public class RelativeLocatorsDemo {

    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String website_url = "https://demo.automationtesting.in/Register.html";
        driver.get(website_url);
        waitfosometime(2000);


//        WebElement firstnameTextbox = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
//        WebElement lastnameTextbox   = driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(firstnameTextbox));
//        lastnameTextbox.sendKeys("sample text");



        WebElement emailaddressTextbox = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
        WebElement phoneTextbox   = driver.findElement(RelativeLocator.with(By.tagName("input")).below(emailaddressTextbox));
        phoneTextbox.sendKeys("9848022338");

    }
}
