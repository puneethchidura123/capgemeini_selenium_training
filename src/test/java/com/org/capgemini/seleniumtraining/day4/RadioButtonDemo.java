package com.org.capgemini.seleniumtraining.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.org.capgemini.seleniumtraining.day3.NavigationDemo.waitfosometime;

public class RadioButtonDemo {

    public static void main(String[] args) throws Exception {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String website_url = "https://automationteststore.com/";
        driver.get(website_url);
        WebElement loginorregisterlink  = driver.findElement(By.xpath("//*[@id=\"customer_menu_top\"]/li/a"));
        loginorregisterlink.click();
        waitfosometime(5000);

        WebElement continue_button = driver.findElement(By.xpath("//button[@title='Continue']"));
        continue_button.click();

        WebElement yes_radio_button = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));

        boolean is_yes_radio_button_selected =   yes_radio_button.isSelected();

        System.out.println("before selection :: "+is_yes_radio_button_selected);

        yes_radio_button.click();

        is_yes_radio_button_selected =   yes_radio_button.isSelected();

        System.out.println("after selection :: "+is_yes_radio_button_selected);
    }
}
