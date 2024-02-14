package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello world!");
        WebDriver driver = new ChromeDriver();  //   open's the chrome browser window
        driver.manage().window().maximize();  //   maximizes the bwoser window
        //driver.manage().window().minimize();  //  minimize the bwoser window

        String website_url = "https://automationteststore.com/";
        driver.get(website_url);   //   launches the given url in the browser window

        String expected_site_homepage_title = "A place to practice your automation skills! ";
        String site_homepage_title = driver.getTitle();
        if(expected_site_homepage_title.equals(site_homepage_title)){
            System.out.println("TEST IS SUCCESSFUL");
        }else{
            System.out.println("TEST IS UNSUCCESSFUL");
        }

        System.out.println("site_homepage_title :: "+site_homepage_title);

        //driver.close();  // will only close the current tab/window and doesn't terminate the browser driver process in client machine
       driver.quit();  // close all the tabs, windows and teminates the browser driver process in client machine

    }
}