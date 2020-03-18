package com.cybertek.tests.day08_ReviewPart2;

import com.cybertek.tests.day04_xpath.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.Driver;

public class VytrackTest {
    public static void main(String[] args) throws InterruptedException {
    titleTest();
    }

    private static void titleTest() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://qa3.vytrack.com/user/login");
        WebElement username = driver.findElement(By.id("prependedInput"));
        username.sendKeys("SalesManager110");
        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123");
        password.submit(); // submit does not test the button


        // <a href="javascript: void(0);" class="dropdown-toggle" data-toggle="dropdown">
        //                            Camila Weissnat
        //                                <i class="fa-caret-down"></i>
        //                    </a>

        WebElement profileName = driver.findElement(By.cssSelector("a[href='javascript: void(0);'] "));
        profileName.click();

        //<ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu">

        WebElement configuration = driver.findElement(By.cssSelector("ul.dropdown-menu>li>a[href='/config/user/profile']"));
        configuration.click();

        Thread.sleep(3000);
        String excepted = profileName.getText();
        String actual = driver.getTitle();


        if (excepted.equalsIgnoreCase(actual)){
            System.out.println("PASS");
        }else{
            System.out.println("Fail");
            System.out.println("excepted: " + excepted);
            System.out.println("actual: " + actual );
        }



    }
}
