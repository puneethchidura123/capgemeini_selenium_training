package com.org.capgemini.seleniumtraining.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class TaskSolving {

    public static void main(String[] args) {

        String url = "file:///C:/Users/Chaithanya%20Kumar/Documents/practicesite.html";
        String category_name =  "Cloud Security Vulnerabilities";
        List<String> result = new TaskSolving().getVulnerables(url,category_name);
        System.out.println(result);
    }


    public List<String> getVulnerables(String url, String category){
//code here


        List<String> result = new ArrayList<>();
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        List<WebElement> rows =  driver.findElements(By.xpath("//table/tbody/tr"));
        int no_of_rows = rows.size();
        System.out.println("no_of_rows :: "+no_of_rows);
        for(int i =1;i<=no_of_rows;i++){
           WebElement category_in_column =  driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]"));
           String cat_name = category_in_column.getText();
           if(cat_name.equals(category)){
               WebElement software_name_we =  driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]"));
               String matching_software_name =    software_name_we.getText();
               result.add(matching_software_name);
           }
        }
        return result;
    }

}
