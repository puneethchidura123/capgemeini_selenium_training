package com.org.capgemini.seleniumtraining.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

import static com.org.capgemini.seleniumtraining.day3.NavigationDemo.waitfosometime;

public class WindowHandling {

    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String website_url = "https://www.hyrtutorials.com/p/window-handles-practice.html";
        driver.get(website_url);
        waitfosometime(2000);


        String parent_window_handele =   driver.getWindowHandle();
        System.out.println("parent_window_handele :: "+parent_window_handele);
        WebElement open_new_windowButton = driver.findElement(By.id("newTabBtn"));
        open_new_windowButton.click();

        Set<String> window_handles =  driver.getWindowHandles();


        String child_window_handel = null;

        for(String current_window_handel : window_handles){
            if(!current_window_handel.equals(parent_window_handele)){
                child_window_handel = current_window_handel;
            }
        }



        while(true){
            System.out.println("before switching ::: "+driver.getTitle());
            driver.switchTo().window(child_window_handel);
            System.out.println("after switching ::: "+driver.getTitle());
            waitfosometime(1000);
            driver.switchTo().window(parent_window_handele);
        }

        //System.out.println("After switching back to parent ::: "+driver.getTitle());



    }
}
