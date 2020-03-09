package com.cybertek.tests.day03_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
    public static void main(String[] args) {
        //http://practice.cybertekschool.com/dynamic_loading


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/dynamic_loading");

        //<a href="/dynamic_loading/3">Example 3: Element
        // on page that is hidden and become visible after 5 seconds</a>

        WebElement example = driver.findElement(By.linkText("Example 3: Element on page that is hidden and become visible after 5 seconds"));

        System.out.println(example.getText());

        String textVersionOfExample = example.getText();


        //linktext vs partialText


        WebElement example_part2 = driver.findElement(By.partialLinkText("5 seconds"));

        String text = example_part2.getText();
        System.out.println(text);


        WebElement cybertek = driver.findElement(By.partialLinkText("Cybertek"));

        String school = cybertek.getText();

        System.out.println(school);

    }
}
