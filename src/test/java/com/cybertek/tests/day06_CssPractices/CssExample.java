package com.cybertek.tests.day06_CssPractices;

import com.cybertek.tests.day04_xpath.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssExample {
    public static void main(String[] args) {
       WebDriver driver = WebDriverFactory.getDriver("chrome");

       driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement button = driver.findElement(By.cssSelector("button#disappearing_button"));

        System.out.println(button.getText());





    }
}
