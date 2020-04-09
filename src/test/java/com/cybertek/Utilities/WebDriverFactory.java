package com.cybertek.Utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

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
                   WebDriverManager.firefoxdriver().setup();
                   driver = new FirefoxDriver();
                   break;
               case "safari":
                   driver = new SafariDriver();
               case"edge":
                   driver = null;
        }

        return driver;

    }

}
