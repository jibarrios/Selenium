package com.cybertek.tests.day04_xpath;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

        //write a static return method, which returns WebDriver
        //name : getDriver
        //it takes a String as parameter --> browser Type
        //return ChromeDriver snf FireDriver

        public static WebDriver getDriver(String browsertype){
            //local variable
            WebDriver driver = null;
           switch (browsertype.toLowerCase()){
               case "chrome":
                   WebDriverManager.chromedriver().setup();
                   driver = new ChromeDriver();
                   break;
               case "firefox":
                   WebDriverManager.chromedriver().setup();
                   driver = new FirefoxDriver();

        }

        return driver;

    }

}
