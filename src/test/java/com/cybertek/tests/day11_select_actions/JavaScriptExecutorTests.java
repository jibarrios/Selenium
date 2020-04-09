package com.cybertek.tests.day11_select_actions;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptExecutorTests {
    WebDriver driver;
    JavascriptExecutor jse;



    @BeforeMethod
    public void beforeMethod() {

        driver = (WebDriver) WebDriverFactory.getDriver("chrome");
        jse = (JavascriptExecutor) driver;

    }

    @AfterMethod
    public void afterTest() {
        driver.quit();
    }
    @Test
    public void scroll() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/");

        WebElement link = driver.findElement(By.linkText("Cybertek School"));
        Thread.sleep(2000);
        jse.executeAsyncScript("arguments[0].scrollIntoView(true);", link);
        Thread.sleep(2000);

    }

    @Test
    public void sendKeysWithJS(){
        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        WebElement input = driver.findElement(By.cssSelector("input[disabled]"));
        String text = "Hi World ";

        jse.executeAsyncScript("arguments[0].setAttribute('value', '" + text + "", input);

        //"arguments[0].setAttribute('value', 'Hello World")


    }




}
