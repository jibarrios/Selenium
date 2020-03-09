package com.cybertek.tests.day05_moreXpath;

import com.cybertek.tests.day04_xpath.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathDemo {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //Where the elements comes from?
      //  form the finElement methods
        //how findElement finds element?
        //Using Locators


        WebElement buttonOne = driver.findElement(By.xpath("//button[@onclick='button1()']"));
        //Start interacting w/ elements
        String text = buttonOne.getText();
        System.out.println(text);


        WebElement buttonTwo = driver.findElement(By.xpath("//h3/following-sibling::button[2]"));
        System.out.println(buttonTwo.getText());

        System.out.println(driver.findElement(By.xpath("//button[3]")));


        WebElement buttonFour = driver.findElement(By.xpath("//div/button/[4]"));
        System.out.println(buttonFour.getText());

        WebElement buttonFive = driver.findElement(By.xpath("//Button[.= 'Button 5']"));
        System.out.println(buttonFive.getText());

        WebElement buttonSix = driver.findElement(By.xpath("//button[@id='disappearing_button']"));
        //element.getAttribute("value") --. method to get text form element, used w/
        //get text of the element
        System.out.println(buttonSix.getAttribute("innerHTML"));


        System.out.println(buttonSix.getAttribute("innerHTML"));


    }
}
