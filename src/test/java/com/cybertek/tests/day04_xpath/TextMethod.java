package com.cybertek.tests.day04_xpath;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextMethod {
    public static void main(String[] args) {


        /*
        go to http://practice.cybertekschool.com/context_menu
        verify context Menu is on the page
        <h3>Context Menu</h3>
         */
        WebDriver driver2 = WebDriverFactory.getDriver("Chrome");
        driver2.get("http://practice.cybertekschool.com/context_menu");
        WebElement menu = driver2.findElement(By.xpath("//h3[text()='Context Menu']"));
        String expected = "Context Menu";
        String actual = menu.getText();
        if (expected.equals(actual)) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }
}
