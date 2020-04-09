package com.cybertek.tests.day13_waits_and_synchronization;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWaitExample {


    WebDriver driver;



    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void test(){
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());

        driver.get("https://store.steampowered.com/");

        //wait  for the title of the second page

        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.titleContains("Steam"));

        System.out.println(driver.getTitle());
    }
}

