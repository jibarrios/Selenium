package com.cybertek.tests.day1_Navigate;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrl {
    public static void main(String[] args) {
        /*
        1.go to Esty https:/www.esty.com/
        2.verify URL
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("https://www.esty.com/");
        driver.manage().window().maximize();


        String expectedURL = "https://www.esty.com/";
        String actualURL = driver.getCurrentUrl();

        if(expectedURL.equals(actualURL)){
            System.out.println("pass");
        }else{
            System.out.println("Fail");
            System.out.println("actual URL is " + actualURL);
        }
        driver.close();

    }
}
