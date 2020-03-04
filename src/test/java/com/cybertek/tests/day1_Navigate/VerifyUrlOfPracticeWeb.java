package com.cybertek.tests.day1_Navigate;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrlOfPracticeWeb {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");
        driver.manage().window().maximize();

        String expectedURl = "http://practice.cybertekschool.com/";

        String actualURL = driver.getCurrentUrl();


        if(expectedURl.equals(actualURL)){
            System.out.println("Pass");
        }else{
            System.out.println("fail");
            System.out.println("The Actual Url is  " + actualURL);
        }
        driver.close();
    }
}
