package com.cybertek.tests.day10_WebElement;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DisabledAndDisplayedTests {
       WebDriver driver;
        @BeforeMethod
        public void beforeMethod() {
            driver = WebDriverFactory.getDriver("chrome");
            driver.get("http://practice.cybertekschool.com/radio_buttons");

        }

        @AfterMethod
        public void afterTest() {
            driver.quit();
        }
        /*
        go  to "http://practice.cybertekschool.com/radio_buttons"
        verify green is disable
        verify black is disable
         */
        @Test
        public void DisabledTest() throws InterruptedException {
            Thread.sleep(200);
            WebElement green = driver.findElement(By.id("green"));
            WebElement black = driver.findElement(By.id("black"));

            //isEnabled -> returns true if the element is enabled, active
            System.out.println("Is green enabled: " + green.isEnabled());
            System.out.println("Is black enabled: " + black.isEnabled());

            System.out.println("black: " + black.getAttribute("disabled"));
            //black is excepted to return null b/c its active element
            System.out.println("Green: " + green.getAttribute("disabled"));


            //verify that certain value is equal to null verify element is enabled
            Assert.assertEquals(black.getAttribute("disabled"), null);
            //VERIFY THAT VALUE OF black.getAttribute("disabled") IS NULL
            Assert.assertNull(black.getAttribute("disabled"));

            //VERIFY that certain value is equal to true. verify element is disabled
            Assert.assertEquals(green.getAttribute("disabled"), true);
            Assert.assertTrue(Boolean.parseBoolean(green.getAttribute("disabled")));
        }
            @Test
            public void testElementVisible(){
            driver.get("http://practice.cybertekschool.com/dynamic_loading/1");
            WebElement username = driver.findElement(By.id("username"));
            WebElement start = driver.findElement(By.tagName("button"));

            //verify that usename is not visible is not visible
                //isDisplayed -> return true element we found in HTML is visible on page
                System.out.println("Username is visible: " + username.isDisplayed());

                Assert.assertFalse(username.isDisplayed());

                System.out.println("Click on Start");
                start.click();


            }


        }


