package com.cybertek.tests.day04_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickvsSubmit {
    public static void main(String[] args) {
        /*
        click()
        submit()

        task:
        1.go to forgot password web page
        2.enter any email
        3.click "retrieve password" bttb

        4.verify the url is:
        http://practice.cybertekschool.com/forgot_password
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().maximize();



       WebElement emailname = driver.findElement(By.name("email"));
       emailname.sendKeys("abc@gmail.com");

       WebElement button = driver.findElement(By.id("form_submit"));
       button.submit();

       String expectURl = "http://practice.cybertekschool.com/forgot_password";
       String actualURl =  driver.getCurrentUrl();


//       if (actualURl.equalsIgnoreCase(expectURl)){
//           System.out.println("Test Passed");
//       }else{
//           System.out.println("Test failed");
//           System.out.println("Actual Url is " + actualURl);
//
//       }

        String exceptedText = "Your e-mail's been sent!";

        WebElement msg = driver.findElement(By.tagName("h4"));
        String actualMsg = msg.getText(); // <- you converted to string

        if(exceptedText.equalsIgnoreCase(actualMsg)){
            System.out.println("Test Pass");
        }else{
            System.out.println("Fail Pass");
        }

        driver.close();













    }
}
