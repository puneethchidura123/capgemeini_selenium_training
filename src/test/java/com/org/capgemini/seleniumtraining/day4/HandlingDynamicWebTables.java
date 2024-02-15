package com.org.capgemini.seleniumtraining.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static com.org.capgemini.seleniumtraining.day3.NavigationDemo.waitfosometime;

public class HandlingDynamicWebTables {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String website_url = "https://www.w3schools.com/html/html_tables.asp";
        driver.get(website_url);
        //waitfosometime(5000);

        JavascriptExecutor javascriptExecutor  = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,300)");



       List<WebElement> rows =  driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));

       int no_of_rows = rows.size();
        System.out.println("size of list :: "+no_of_rows);


        int required_row_num = 2;

        int calculated_row_num= required_row_num+1;

        List<String>  extracted_country_Names = new ArrayList<>();
                //new ArrayList<>();

        String required_country_name = "Italy";

        for(int i = 2;i<=no_of_rows;i++){
            System.out.println("*******************************************************************************");

            //WebElement required_company =
                    driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td[1]"));
            //WebElement required_contact =
                    driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td[2]"));
            WebElement required_country=
                    driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td[3]"));


            //System.out.println("required_company :: "+required_company.getText());
            //System.out.println("required_contact :: "+required_contact.getText());
            System.out.println("required_country :: "+required_country.getText());
            extracted_country_Names.add(required_country.getText());
            System.out.println("*******************************************************************************");
        }

        boolean is_required_country_present =   extracted_country_Names.contains(required_country_name);

        System.out.println("is_required_country_present :: "+is_required_country_present);

//        WebElement required_company =
//                driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+calculated_row_num+"]/td[1]"));
//        WebElement required_contact =
//                driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+calculated_row_num+"]/td[2]"));
//        WebElement required_country=
//                driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+calculated_row_num+"]/td[3]"));
//
//
//        System.out.println("required_company :: "+required_company.getText());
//        System.out.println("required_contact :: "+required_contact.getText());
//        System.out.println("required_country :: "+required_country.getText());




    }
}
