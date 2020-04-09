package com.cybertek.tests.Office_Hours.Office_Hours;

import com.cybertek.Utilities.BrowserUtils;
import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SelectOfficePracticeTest {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {

        driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void afterTest() {
        driver.quit();
    }

    //go to https://samples.
        /*
        verify that table has dropdown with values family, Friends
         */


    @Test
    public void test() throws InterruptedException {
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCellTable");
        Thread.sleep(2000);
        Select categories = new Select(driver.findElement(By.cssSelector("select[tabindex='-1']")));

        // getOptions --> gives all available options as a list of web elements
        List<WebElement> allOptionsEl = categories.getOptions();

        System.out.println("Number of options: " + allOptionsEl.size());

        List<String> expectedOptions = Arrays.asList("Family", "Friends", "Coworkers", "Businesses", "Contacts");

        // given a list web elements, extract the text of the elements into new list of strings
        List<String> allOptionsStr = BrowserUtils.getElementsText(allOptionsEl);

        Assert.assertEquals(allOptionsStr, expectedOptions);

    }

    /*
go to http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCellTable
select option Coworkers
verify that that Coworkers is now selected
select options Contacts
verify that contacts is selected
*/
    @Test
    public void test2() throws InterruptedException {
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCellTable");
        Thread.sleep(2000);
        Select categories = new Select(driver.findElement(By.cssSelector("select[tabindex='-1']")));
        //  select option Coworkers


        Thread.sleep(1000);
        categories.selectByVisibleText("Coworkers");
//        verify that that Coworkers is now selected
        // getFirstSelectedOption --> returns the currently selected option as Web element
        categories = new Select(driver.findElement(By.cssSelector("select[tabindex='-1']")));
        String actual = categories.getFirstSelectedOption().getText();
        Assert.assertEquals(actual, "Coworkers");
        categories = new Select(driver.findElement(By.cssSelector("select[tabindex='-1']")));
        categories.selectByVisibleText("Contacts");

        //
        categories = new Select(driver.findElement(By.cssSelector("select[tabindex='-1']")));
        String actual1 = categories.getFirstSelectedOption().getText();

        Assert.assertEquals(actual1, "Contacts");
    }
    @Test
    public void test3() {
        driver.get("http://practice.cybertekschool.com/dropdown");
        Select days = new Select(driver.findElement(By.id("day")));
        List<WebElement> options = days.getOptions();
        System.out.println("Number of options: " + options.size());

        // I have a list of web Elements, I need to verify if the values (numbers) are sorted in ascending order
        List<String> stringList = BrowserUtils.getElementsText(options);

        List<Integer> ints = new ArrayList<>();
        for (String words : stringList) {
            ints.add(Integer.parseInt(words));
        }
        //We cant sort it because we are trying to figure is it is in order
        System.out.println(ints);

        //Verify list of ints is sorted

        //Create new class w/ values of the given list
        List<Integer> intsCopy = new ArrayList<>(ints);
        //sorting the list
        Collections.sort(intsCopy);
        //finally compare
        Assert.assertEquals(ints, intsCopy); // in this case ints list is actual and intsCopy is Excepted

    }









    }


