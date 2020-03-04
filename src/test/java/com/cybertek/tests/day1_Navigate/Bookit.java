package com.cybertek.tests.day1_Navigate;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bookit {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("https://cybertek-reservation-qa.herokuapp.com/sign-in");
        driver.manage().window().maximize();
        String exceptedTitle = "Bookit";

        String actualTitle = driver.getTitle();

        if (actualTitle.equalsIgnoreCase(exceptedTitle)){
            System.out.println("pass");
        }else {
            System.out.println("fail");
            System.out.println("Actual Title: " + actualTitle);
        }


      //  driver.navigate().to("https://cybertek-reservation-qa.herokuapp.com/sign-in");

      // recommend to storage it in a variable
        //String partialUrl = "cybertek-reservation";
        String actualURL = driver.getCurrentUrl();

        if(actualURL.contains("cybertek-reservation")){
            System.out.println("Pass");
        }else{
            System.out.println("fail");
            System.out.println("Actual URL: " + actualURL);
        }
        driver.close();


    }
}
