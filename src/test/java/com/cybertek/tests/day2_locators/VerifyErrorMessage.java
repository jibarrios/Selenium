package com.cybertek.tests.day2_locators;

import com.cybertek.tests.day03_locators.FakerPractice;
import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMessage {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/login");


        //Tester will gather test Data in excel Sheet
        /*

         */

        Faker faker = new Faker();
        String username = faker.name().firstName();
        String password = faker.app().author();


        driver.findElement(By.name("username")).sendKeys((username));
        driver.findElement(By.name("password")).sendKeys("SuperSecret");
        driver.findElement(By.id("wooden_spoon")).click();

        //<div data-alert="" id="flash" class="flash error">
//                Your username is invalid!
//                <a href="#" class="close">×</a>
//          </div>







    }
}
