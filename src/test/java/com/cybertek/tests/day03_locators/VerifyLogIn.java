package com.cybertek.tests.day03_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogIn {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("http://practice.cybertekschool.com/login");

        driver.findElement(By.name("username")).sendKeys("tomsmith");

        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword");

        driver.findElement(By.id("wooden_spoon")).click();


        //Locate the welcome message  w/ tag name

        WebElement welcomeMsg = driver.findElement(By.tagName("h4"));

        String expectedResult = "Welcome to the Secure Area. When you are done click logout below.";
        //String vs WebElement
        //Since it WebElement you need to converts it to String (. getText();)

        String actualMsg = welcomeMsg.getText();

        if (expectedResult.equalsIgnoreCase(actualMsg)){
            System.out.println("Pass");
        }else{
            System.out.println("fail");
        }
        driver.close();




    }
}
