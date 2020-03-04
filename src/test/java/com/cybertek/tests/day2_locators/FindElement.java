package com.cybertek.tests.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
    public static void main(String[] args) {
        // task
        //go to cybertek okta login page
        //Write email to the text box
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://cybertekschool.okta.com/");

        //Write email to the text box
        /*
        1.Find the text box first -->
         */

        WebElement emailBox = driver.findElement(By.id("okta-signin-username"));

        emailBox.sendKeys("jibmazariegos@gmail.com");

        driver.findElement(By.id("okta-signin-password")).sendKeys("J3425");

        driver.findElement(By.id("okta-signin-submit")).click();




    }
}
