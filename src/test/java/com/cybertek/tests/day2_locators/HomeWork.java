package com.cybertek.tests.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {
    public static void main(String[] args) throws InterruptedException{
//        Go to amazon  https://www.amazon.com/
//        Go to Ebay   https://www.ebay.com/
//        Enter a search term
//        Click on search button
//        Verify title contains search term

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");
        Thread.sleep(3000);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone case");
        Thread.sleep(3000);
        driver.findElement(By.className("nav-input")).click();
        Thread.sleep(3000);
        String exceptedTitle= "iphone case";

        String actualTitle = driver.getTitle();

        if(actualTitle.contains(exceptedTitle)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println(actualTitle);
        }
        Thread.sleep(3000);

        driver.navigate().to("https://www.ebay.com/");
        Thread.sleep(3000);
        driver.findElement(By.id("gh-ac")).sendKeys("boxing gloves");
        Thread.sleep(3000);
        driver.findElement(By.id("gh-btn")).click();
        Thread.sleep(3000);
        String exceptedTitleEb = "boxing gloves";

        String actualTitleEb = driver.getTitle();

        if(actualTitleEb.contains(exceptedTitleEb)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println(actualTitleEb);
        }
        Thread.sleep(3000);
        driver.close();


           // if(class="a-color-state a-text-bold")





// id="twotabsearchtextbox"



    }
}
