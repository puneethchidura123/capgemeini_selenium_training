package com.org.capgemini.seleniumtraining.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.Alert;

import static com.org.capgemini.seleniumtraining.day3.NavigationDemo.waitfosometime;

public class HandlingAlerts {


    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String website_url = "https://demo.automationtesting.in/Alerts.html";
        driver.get(website_url);
        //waitfosometime(5000);


//        WebElement alert_with_ok = driver.findElement(By.xpath("//a[text()='Alert with OK ']"));
//        alert_with_ok.click();
//        waitfosometime(2000);
//        WebElement button = driver.findElement(By.xpath("//*[@id='OKTab']/button"));
//        button.click();
//        waitfosometime(2000);
//        Alert generated_alert = driver.switchTo().alert();
//        generated_alert.accept();


//        WebElement alert_with_ok = driver.findElement(By.xpath("//a[@href='#CancelTab' and @data-toggle='tab' and @class='analystic']"));
//        alert_with_ok.click();
//        waitfosometime(2000);
//        WebElement button = driver.findElement(By.xpath("//*[@id='CancelTab']/button"));
//        button.click();
//        waitfosometime(2000);
//        Alert generated_alert = driver.switchTo().alert();
//        generated_alert.dismiss();



        WebElement alert_with_ok = driver.findElement(By.xpath("//a[@href='#Textbox' and @data-toggle='tab' and @class='analystic']"));
        alert_with_ok.click();
        waitfosometime(2000);
        WebElement button = driver.findElement(By.xpath("//*[@id='Textbox']/button"));
        button.click();
        waitfosometime(2000);
        Alert generated_alert = driver.switchTo().alert();
        //String alert_message =  generated_alert.getText();
        //System.out.println("alert_message :: "+alert_message);
        generated_alert.sendKeys("idfgdsifgusfg");
        waitfosometime(8000);
        generated_alert.accept();


    }
}
