package com.cybertek.tests.Office_Hours.Office_Hours;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.HashMap;

public class officeHours {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("http://qa3.vytrack.com");
        WebElement username = driver.findElement(By.id("prependedInput"));
        username.sendKeys("salesmanager110");
        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123");
        WebElement button = driver.findElement(By.id("_submit"));
        button.click();

        //<a href="/contact"></a>

        WebElement contact_link = driver.findElement(By.xpath("(//a[@href='/contact'])[4]"));
        Thread.sleep(5000);
        contact_link.click();

        Thread.sleep(4000);
        WebElement createContact = driver.findElement(By.linkText("Create Contact"));
        createContact.click();

        Thread.sleep(2000);
        String currentTitle = driver.getTitle();
        if (currentTitle.equalsIgnoreCase("Create Contact - Contacts - Customers")) {
            System.out.println("Title is expected");
        } else {
            System.out.println("Title is Not expected");
        }
        Thread.sleep(1000);
        HashMap<String,String> contact1= new HashMap<>();
        contact1.put("First Name","John");
        contact1.put("Last Name ","Smith");
        contact1.put("Phone","571-236-4545");
        contact1.put("Street","400 Main Street");
        contact1.put("City","Tysons");
        contact1.put("State","VA");
        contact1.put("ZipCode","22102");
        contact1.put("Sales Group","true");
        contact1.put("Country","United States");
        System.out.println("contact 1: " + contact1);
    }
}


