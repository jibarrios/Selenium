package com.cybertek.tests.day04_xpath;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class PracticeFactory {

    public static void main(String[] args) {
        //go to Google

//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.google.com/");

        ///html/body/div/div[2]/div/div/div[1]/button


        /*
        --> for relative Xpath, when yyour using // it focus on the a specific
        Attribute
         */




    }
}
