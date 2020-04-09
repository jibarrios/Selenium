package com.cybertek.tests.homework;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeWork1 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void afterTest() {
        driver.quit();
    }

    @Test
    public void test() throws InterruptedException {
    driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");


    //List<WebElement> list = (List<WebElement>) driver.findElement(By.("gwt-CheckBox"));





    }
}

