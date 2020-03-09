package com.cybertek.tests.day04_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
    public static void main(String[] args) {

        /*
        Go to forgot password page
        locate retrieve password bttn
        print out submit value
                type = 'submit'

         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement button = driver.findElement(By.id("form_submit"));


        System.out.println(button.getAttribute("type"));

        System.out.println(button.getAttribute("class"));

        // getAttribute() <- gives you the value of the element

    }
}
