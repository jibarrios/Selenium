package com.cybertek.tests.day1_Navigate;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
    public static void main(String[] args)throws Exception{
        //binary the driver and browser
        WebDriverManager.chromedriver().setup();

        //WebDriver object needs to be created --> interface
        //driver has been created
        WebDriver driver = new ChromeDriver();

        //Open google homePage
        //** how do you launch /open a webPage?
        //by using the get method --> url as string
        //driver.get("https://www.google.com");

        //navigation
        //navigate(), to() --> open a web page

        driver.navigate().to("https://www.google.com");

        // get() Vs. navigate().to
        //get --> wait to load page
        //to()--> does not wait

        //navigate().back()-->
        //1. go to google  2.go to CyberTek practice website
        driver.get("https://www.google.com");
        Thread.sleep(3000);
        driver.navigate().to("http://practice.cybertekschool.com/");
        Thread.sleep(3000);
        driver.navigate().back();


    // navigate().forward()
        //go practice -> go to google -> back to practice
        //

    }
}
