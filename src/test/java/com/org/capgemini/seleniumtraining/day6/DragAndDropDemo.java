package com.org.capgemini.seleniumtraining.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static com.org.capgemini.seleniumtraining.day3.NavigationDemo.waitfosometime;

public class DragAndDropDemo {

    @Test
    public void dragAndDrop() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String website_url = "https://the-internet.herokuapp.com/drag_and_drop";
        driver.get(website_url);
        waitfosometime(2000);

        WebElement source = driver.findElement(By.id("column-a"));
        WebElement target = driver.findElement(By.id("column-b"));


        Actions actions = new Actions(driver);

        actions.dragAndDrop(source,target).build().perform();
    }
}
