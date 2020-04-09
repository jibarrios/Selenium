package com.cybertek.tests.day11_select_actions;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionsClassDemo {
    WebDriver driver;
    Actions actions;

    @BeforeMethod
    public void beforeMethod() {

        driver = WebDriverFactory.getDriver("chrome");
        //Actions actions = new Actions(driver);
        //This would declare it as local object which we don't want b/c we going to
        //constantly be use in it which is why we need to declare in the above class
        actions= new Actions(driver);
    }

    @AfterMethod
    public void afterTest() {

        driver.quit();
    }
    @Test
    public void hoverTest() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/hovers");
        Thread.sleep(2000);
        WebElement target  = driver.findElement(By.tagName("img"));

        //moveToElement -> move the mouse on top of the element
        actions.moveToElement(target).perform();
        Thread.sleep(3000);
    }
    @Test
    public void hoverTest2(){
        driver.get("http://practice.cybertekschool.com/jqueryui/menu");
        WebElement enabled = driver.findElement(By.id("ui-id-3"));
        WebElement downloads = driver.findElement(By.id("ui-id-4"));//This these
        WebElement pdf = driver.findElement(By.id("ui-id-5"));// are fix IDs so we can use them

        //Move the mouse to enabled
        //wait
        //Move the mouse to downloads
        //wait
        //Move the mouse to PDF


        actions.
                moveToElement(enabled).
                pause(4000). // this basically thread.sleep recommended not to use often
                moveToElement(downloads).
                pause(4000).
                click(pdf).
                build().perform();



    }

    @Test
    public void dragAndDrop() throws InterruptedException {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        //actions.dragAndDrop()

        WebElement money = driver.findElement(By.id("draggable"));
        WebElement bank = driver.findElement(By.id("droptarget"));

        //Scroll
        actions.sendKeys(Keys.PAGE_DOWN);
        //actions.moveToElement(); also scrolls not always


        Thread.sleep(2000);
        actions.moveToElement(money).clickAndHold().moveToElement(bank).release().build().perform();
        Thread.sleep(2000);

    }
        /*
        Task
        Do the drag and drop by chaining actions
        Move mouse to source/ money
        mouse down
        move mouse to target/bank
        mouse UP
        */
        @Test
     public void dragAndDropAgain() throws InterruptedException {
            driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");

            WebElement money = driver.findElement(By.id("draggable"));
            WebElement bank = driver.findElement(By.id("droptarget"));
            Thread.sleep(3000);
            actions.moveToElement(money).clickAndHold().
                    moveToElement(bank).release().build().perform();

        }
}