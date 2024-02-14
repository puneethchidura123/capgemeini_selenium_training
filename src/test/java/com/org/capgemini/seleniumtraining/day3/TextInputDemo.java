package com.org.capgemini.seleniumtraining.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextInputDemo  extends  NavigationDemo{

    public static void main(String[] args) throws Exception {


        extractLabelText();
        //withGetText();
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        String website_url = "https://automationteststore.com/";
//        driver.get(website_url);
//        WebElement loginorregisterlink = driver.findElement(By.xpath("//*[@id=\"customer_menu_top\"]/li/a"));
//        loginorregisterlink.click();
//        waitfosometime(3000);
//
//        WebElement loginnameTextBox = driver.findElement(By.id("loginFrm_loginname"));
//        String text_input =  "input text";
//        loginnameTextBox.sendKeys(text_input);
//
//        String entered_text = loginnameTextBox.getAttribute("value");
//                //loginnameTextBox.getText();
//
//        if (text_input.equals(entered_text)){
//            System.out.println("test passed");
//        }else{
//            throw new RuntimeException(" the entered text doesn't match with the current / existing text\n\n "+" text_input is :: "+text_input+"\n\n"
//                    +" entered_text is :: "+entered_text);
//        }
    }

    public static void withGetText() throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String website_url = "https://omayo.blogspot.com/";
        driver.get(website_url);

        WebElement text_area_input = driver.findElement(By.xpath("//textarea[@rows='10' and @cols='30']"));

        while (true){
            String existing_text  = text_area_input.getText();
            //text_area_input.getAttribute();
            System.out.println("existing_text is :: "+existing_text);
            waitfosometime(2000);
            text_area_input.clear();
            waitfosometime(2000);
            text_area_input.sendKeys(existing_text);
            waitfosometime(2000);
        }


    }


    public static void extractLabelText() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String website_url = "https://demo.automationtesting.in/Register.html";
        driver.get(website_url);
        waitfosometime(2000);


        WebElement email_label = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[3]/label"));
        String email_text =   email_label.getText();

        System.out.println("email_text  is ::: "+email_text);
    }
}
