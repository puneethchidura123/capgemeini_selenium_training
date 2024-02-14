package com.org.capgemini.seleniumtraining.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownDemo extends NavigationDemo{

    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String website_url = "https://demo.automationtesting.in/Register.html";
        driver.get(website_url);
        waitfosometime(2000);

        WebElement skills_Dropdown = driver.findElement(By.id("Skills"));

        Select skills_Dropdown_Select = new Select(skills_Dropdown);

        WebElement selected_option =   skills_Dropdown_Select.getFirstSelectedOption();
        String select_option_as_string =   selected_option.getText();

        System.out.println("select_option_as_string pre selection:: "+select_option_as_string);

        //skills_Dropdown_Select.selectByVisibleText("C");

        //skills_Dropdown_Select.selectByIndex(1);

        skills_Dropdown_Select.selectByValue("Adobe Photoshop");

        selected_option =   skills_Dropdown_Select.getFirstSelectedOption();
        select_option_as_string =   selected_option.getText();

        System.out.println("select_option_as_string post selection:: "+select_option_as_string);


         List<WebElement> skill_options = skills_Dropdown_Select.getOptions();

         for(WebElement webElement: skill_options){
             System.out.println(webElement.getText());
         }




    }
}
