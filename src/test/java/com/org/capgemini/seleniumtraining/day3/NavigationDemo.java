package com.org.capgemini.seleniumtraining.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {

    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String website_url = "https://automationteststore.com/";
        driver.get(website_url);
        WebElement loginorregisterlink  = driver.findElement(By.xpath("//*[@id=\"customer_menu_top\"]/li/a"));
       loginorregisterlink.click();
        waitfosometime(5000);
//       while(true){
//           //waitfosometime(5000);
//           driver.navigate().back();
//           waitfosometime(3000);
//           driver.navigate().forward();
//       }

        driver.navigate().refresh();


    }


    public static void waitfosometime(int wait_time) throws  Exception {

        Thread.sleep(wait_time);
//        try {
//
//        }catch (Exception e){
//            // handling code
//        }

    }
}
