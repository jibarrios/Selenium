package com.cybertek.tests.homework;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class CheckBoxDropdown {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();

    }
    @Test
    public void test() throws InterruptedException {
    driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");
    Thread.sleep(3000);
        List<WebElement> list = driver.findElements(By.xpath("//span[contains(class,gwt-CheckBox)]"));
        int checkboxSize = list.size();
        for (WebElement checkbox : list){
            Thread.sleep(2000);
            if (!checkbox.isSelected() && checkbox.isEnabled()){
                Thread.sleep(2000);
            }
           // for (int i = 0; i < ; i++) {

            //}

//document.getElementById("Button").disabled=false;
        }


       }


    }

