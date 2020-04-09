package com.cybertek.tests.Office_Hours.Office_Hours;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleHover {

    WebDriver driver;


    @BeforeMethod
    public void beforeMethod() {

        driver = (WebDriver) WebDriverFactory.getDriver("chrome");
        driver.get("https://www.google.com/");
    }

    @AfterMethod
    public void afterTest() {
        driver.quit();
    }

//        Go to google.com
//        Move your mouse on top of I am feeling lucky
//        Verify that button now has a different text
//        Move the mouse away
//        Do this many times
//        When you get “I am feeling stellar” 3 times, print “Deal with it” in console and exit the program
        @Test
    public void test(){
        Actions actions = new Actions(driver);
        WebElement buttons = driver.findElement(By.id("gbqfbb"));

        actions.
                pause(1000).moveToElement(buttons).pause(1000).
                build().perform();
        String notUnexpected = "I'm Feeling lucky";

       // String actual = buttons.getText(); so If there is no text,
        // when using getText() will just return an empty String, which why it would pass
        String actual = buttons.getAttribute("value");
        System.out.println("Actual: " + actual);
        Assert.assertNotEquals(notUnexpected, actual);

    }



}
