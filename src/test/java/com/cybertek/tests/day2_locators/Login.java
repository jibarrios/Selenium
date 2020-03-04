package com.cybertek.tests.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {
    public static void main(String[] args) throws InterruptedException {
        /*
        1. go to VyTrack login page
        2.Write username data: StoreManager52
        3."Write password "
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://app.vytrack.com/user/login");

//        We using name locator:
//        WebElement element1=driver.findElement(By.name("_username"));
//        element1.sendKeys("storemanager51");
//        Thread.sleep(2000);
//        WebElement element2=driver.findElement(By.name("_password"));
//        element2.sendKeys("UserUser123");
//        Thread.sleep(2000);
//        element2.sendKeys(Keys.ENTER);


        Thread.sleep(3000);

        //find login bttn, and  then click
        WebElement loginBttn = driver.findElement(By.id("_submit"));
        Thread.sleep(3000);
        loginBttn.click();

        // WebElement loginBttn =driver.findElement(By.id("_submit")).click(); // <- direct Approach

        //Verify that your in the homepage
        String expectedUrl = "https://qa2.vytrack.com/";
        String actualUrl = driver.getCurrentUrl();
        if (expectedUrl.equals(actualUrl)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("expectedUrl = " + expectedUrl);
            System.out.println("actualUrl = " + actualUrl);
        }
        Thread.sleep(2000);
        driver.close();
    }



    }

