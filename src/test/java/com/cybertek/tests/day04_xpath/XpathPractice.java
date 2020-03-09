package com.cybertek.tests.day04_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathPractice {
    public static void main(String[] args) {
        //go to practice login page
        // Locate email w/ username box w/ Absolute xPath
        // Locate email w/ password box w/ Absolute xPath

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/login");

        WebElement test = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/form/div[1]/div/input"));
        test.sendKeys("abc@gmail.com");

        WebElement passwordBox = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/form/div[2]/div/input"));
        passwordBox.sendKeys("blahblah");

        // //tagname[@attribute='value']

        //<input type = type = "text">





    }
}
