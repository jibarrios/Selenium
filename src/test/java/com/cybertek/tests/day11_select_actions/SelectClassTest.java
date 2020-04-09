package com.cybertek.tests.day11_select_actions;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectClassTest {
    WebDriver driver;



    @BeforeMethod
    public void beforeMethod() {

         driver = WebDriverFactory.getDriver("chrome");
         driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @AfterMethod
    public void afterTest() {

        driver.quit();
    }

    @Test
    public void SelectedOption(){
        WebElement dropdown = driver.findElement(By.id("dropdown"));


        //create a select class  using the webElement
        Select dropdownList = new Select(dropdown);

        //get the selected option
        WebElement selectedOption = dropdownList.getFirstSelectedOption();
        System.out.println(selectedOption.getText());
        //verify selected option
        Assert.assertEquals(selectedOption.getText(),"Please select an option");

    }
    @Test
    public void selectFromList() throws InterruptedException {
        WebElement dropdown = driver.findElement(By.id("state"));
        Select states = new Select(dropdown);

        //TODO SelectByVisibleText --> selects by the text of the option
        states.selectByVisibleText("Iowa");
        Thread.sleep(1000);
        states.selectByVisibleText("Vermont");
        Thread.sleep(1000);
        states.selectByVisibleText("Kentucky");
        Thread.sleep(1000);

        //TODO SelectByIndex --> selects by the Index of the option
        states.selectByIndex(0);
        Thread.sleep(1000);
        states.selectByIndex(10);
        Thread.sleep(1000);
        states.selectByIndex(20);
        Thread.sleep(1000);


        //TODO SelectByValue --> selects by the value of the attribute of the option
        states.selectByValue("VA");
        Thread.sleep(1000);
        states.selectByValue("SC");
        Thread.sleep(1000);
        states.selectByValue("CO");
        Thread.sleep(1000);
        states.selectByValue("NE");
    }

        @Test
    public void getAllAvailableOPtion(){
        Select monthList = new Select(driver.findElement(By.id("month")));

        //print the current selection
            System.out.println(monthList.getFirstSelectedOption().getText());

            //TODO getOptions --> returns all the available option from the dropDown
            List<WebElement> allOption = monthList.getOptions();

            System.out.println("number of Months: " + allOption.size());

            for(WebElement month : allOption){
                System.out.println(month.getText());
            }
            //Verify that months list always shows the current month as selected
            //get the current month
            String expected = LocalDate.now().getMonth().name();
            String actual = monthList.getFirstSelectedOption().getText();
            Assert.assertEquals(actual.toLowerCase(), expected.toLowerCase());

            //Verify that month list has following Value: january... December
            List<String> expectedlMonth = Arrays.asList("January", "February", "March",
                    "April", "May", "June", "July", "August", "September",
                    "October", "November", "December");


            //get options give me list webElements, so allOptions is a list Webelements
            //but My expected it a list String. I have to make sure the both list of String
            // I need to get list String from list of  Webelement

            List<String>actualMonth = new ArrayList<>(); // <- make a list to fill
            for(WebElement option : allOption){  // so it can go through each item
                // from the allOption list which are WebElements
                actualMonth.add(option.getText()); // so it can be converted to String :)
            }

            Assert.assertEquals(allOption,expectedlMonth); // you were unable to do this
            // b/c you cant compare two different dataTypes so you needed to convert one to same dataType

    }
    @Test
    public void VerifyOption(){
        Select list = new Select(driver.findElement(By.id("dropdown")));
        //verify that list has 3 option
        int expectedSize = 3;
        int actualSize = list.getOptions().size();

        List<String> exceptedValues = Arrays.asList("Please select an option", "Option 1", "Option 2");



    }



}
