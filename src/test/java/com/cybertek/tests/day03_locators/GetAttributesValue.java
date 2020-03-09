package com.cybertek.tests.day03_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributesValue {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("http://practice.cybertekschool.com/login");

        //Locate username box
        WebElement userName = driver.findElement(By.name("username"));

        String valueOfType = userName.getAttribute("type");

        System.out.println("value of type is " + valueOfType);


        WebElement loginButton =driver.findElement(By.id( "wooden_spoon"));

        //Print class Attribute
        System.out.println(loginButton.getAttribute("class"));

    }
}
