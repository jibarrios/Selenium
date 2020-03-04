package com.cybertek.tests.day1_Navigate;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
    public static void main(String[] args) throws InterruptedException {


    /*
       Navigation:
       driver.navigate().to("URL")
       driver.navigate().back()
       driver.navigate().forward()
       driver.navigate().refresh()
        */

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        //I want to see full window

        driver.manage().window().fullscreen();
       // driver.manage().window().maximize(); other way

        String practiceWebUrl = "http://practice.cybertekschool.com/";
        //go to the practice webSite
        driver.get(practiceWebUrl);
        Thread.sleep(3000);

        //Google
        String ggUrl = "https://www.google.com";
        driver.navigate().to(ggUrl);
        Thread.sleep(3000);

        //back to practices
        driver.navigate().back();
        Thread.sleep(3000);

        //forward
        driver.navigate().forward();
        Thread.sleep(3000);
        //Refresh page
        driver.navigate().refresh();

        //Close the  current tab in the window browser
        driver.close();
        //close down windows in the browser
        driver.quit();



    }
}