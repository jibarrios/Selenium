package com.cybertek.tests.day07_Review;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTest {
    // main method to invoke the tests
    public static void main(String[] args) throws InterruptedException {
        nameMatchTest();
        SecondNameMatchTest();

    }

    private static void SecondNameMatchTest() {

    }

    // each test will be a separate method

    /**
     * open browser
     * go to amazon
     * search for any item
     * remember the name of the first result
     * click on the first result
     * verify that product name is same in the product page
     */
    private static void nameMatchTest() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://amazon.com");

        String searchTerm = "disinfectant wipes";
        WebElement searchInput = driver.findElement(By.id("twotabsearchtextbox"));
        // OPTION 1: enter search term and hit ENTER button
//        searchInput.sendKeys(searchTerm + Keys.ENTER);
        // OPTION 2: Enter search term and click the search button
        searchInput.sendKeys(searchTerm);
        WebElement searchBtn = driver.findElement(By.className("nav-input"));
        searchBtn.click();


        Thread.sleep(3000);
        //Write Xpath that capture the first result
        WebElement firstResult = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
        //get the name of the first result
        System.out.println(firstResult.getText());
        String expectedResult = firstResult.getText();

        firstResult.click();
        // Creating variable
        WebElement product = driver.findElement(By.id("productTitle"));
        String actualName = product.getText();

        System.out.println(actualName);

        if (expectedResult.equalsIgnoreCase(actualName)){
            System.out.println("pass");
        }else{
            System.out.println("Fail");
            System.out.println("Excepted Result: " + expectedResult);
            System.out.println("Actual Result: " + actualName);
        }
        driver.quit();



    }


}