package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class IDDemo {


    public  static void main(String[] args){


        WebDriver driver = new ChromeDriver();  //   open's the chrome browser window
        driver.manage().window().maximize();  //   maximizes the bwoser window
        //driver.manage().window().minimize();  //  minimize the bwoser window

        String website_url = "https://automationteststore.com/";
        driver.get(website_url);   //   launches the given url in the browser window


//        WebElement   loginorregisterlink  = driver.findElement(By.xpath("//*[@id=\"customer_menu_top\"]/li/a"));
//        loginorregisterlink.click();


        WebElement   loginorregisterlink  = driver.findElement(By.partialLinkText("Login or "));

        //WebElement   loginorregisterlink  = driver.findElement(By.tagName("Login or "));
       loginorregisterlink.click();


        //WebElement login_nameTextBox = driver.findElement(By.id("loginFrm_loginname"));
        WebElement login_nameTextBox = driver.findElement(By.cssSelector(".loginFrm_loginname"));
        String text_input = "my personal login id";
        login_nameTextBox.sendKeys(text_input);





//        WebElement home = driver.findElement(By.className("active menu_home"));
//        home.click();

    }
}
