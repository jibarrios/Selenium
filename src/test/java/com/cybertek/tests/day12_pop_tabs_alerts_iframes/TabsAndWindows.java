package com.cybertek.tests.day12_pop_tabs_alerts_iframes;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class TabsAndWindows {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void afterTest() {
//        driver.quit();
    }

    @Test
    public void test(){
        driver.get("http://practice.cybertekschool.com/windows");
        WebElement link = driver.findElement(By.linkText("Click Here"));
        link.click();


        System.out.println(driver.findElement(By.tagName("h3")).getText());
        //get all the available tabs
        Set<String> windowHandle1 = driver.getWindowHandles(); //<- returns a set not a list

        // print all the windows handles
        for (String windowHandle : windowHandle1) {
            System.out.println(windowHandle);
        }
        // get the id of current window/tab
        String currentWindow = driver.getWindowHandle();
        System.out.println("currentWindow = " + currentWindow);
        System.out.println("BEFORE SWITCHING");
        System.out.println(driver.getTitle());
        System.out.println(driver.findElement(By.tagName("h3")).getText());

        for (String windowHandle : windowHandle1) {
            driver.switchTo().window(windowHandle);
            if (driver.getTitle().equals("New window")) {
                break;
            }
        }

        System.out.println("AFTER SWITCHING");
        System.out.println(driver.getTitle());
        System.out.println(driver.findElement(By.tagName("h3")).getText());

        // Write a utility that takes a String title
        /*
        changes to tab w/ given title
        if such title is not found, go back to orginal  windows

         */

        //Write a utility that takes a String URL
        /*
        changes to tab w/ given Url
        if such title is not found, go back to orginal  windows
         */



    }
}
