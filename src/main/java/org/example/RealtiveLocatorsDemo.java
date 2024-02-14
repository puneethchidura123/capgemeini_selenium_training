package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RealtiveLocatorsDemo {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();  //   open's the chrome browser window
        driver.manage().window().maximize();  //   maximizes the bwoser window
        //driver.manage().window().minimize();  //  minimize the bwoser window

        String website_url = "https://demo.automationtesting.in/Register.html";
        driver.get(website_url);   //   launches the given url in the browser window


        WebElement element = driver.findElement(By.cssSelector("input[ng-model='EmailAdress']"));
        //element.click();

        WebElement skincare = driver.findElement(RelativeLocator.with(By.tagName("input")).below(element));
        skincare.sendKeys("jhyuf");



    }
}
