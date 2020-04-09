package com.cybertek.tests.homework;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FindLocators {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();

    }
    @Test
    public void amazon(){
        driver.get("https://www.amazon.com");
        WebElement input = driver.findElement(By.id("twotabsearchtextbox"));
        input.sendKeys("boxing gloves");
        WebElement button = driver.findElement(By.className("nav-input"));
        button.click();

        String expectedTitle = "boxing gloves";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedTitle)){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
            System.out.println("Expected Title: " + expectedTitle + "Actual Title: "+ actualTitle);
        }

}
    @Test
    public void wiki() throws InterruptedException {
        driver.get("https://www.wikipedia.org/");

        WebElement input = driver.findElement(By.id("searchInput"));
        input.sendKeys("selenium webdriver");
        Thread.sleep(3000);

        WebElement button = driver.findElement(By.xpath("//button/i[1]"));
        button.click();

        //a[href="/wiki/Selenium_(software)"]
        Thread.sleep(3000);
        WebElement result = driver.findElement(By.cssSelector("a[href='/wiki/Selenium_(software)']"));

        result.click();

        String expectedUrl = "Selenium (software)";

        String actualUrl = driver.getCurrentUrl();

        actualUrl.toLowerCase();

        if (actualUrl.contains(expectedUrl)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
            System.out.println("Excepted Url = " + expectedUrl + "Actual Title = " + actualUrl);
        }
    }

//        @Test
//       public void gGg (){
//            driver.get("https://www.google.com/");
//            WebElement searchInput = driver.findElement(By.cssSelector("//div[@class='a4bIc']"));
//            searchInput.sendKeys("java");
//           // WebElement buTton = driver.findElement(By.xpath("//span[@class='z1asCe MZy1Rb']"));
//
//
//           // WebElement cCumber = driver.findElement(By.cssSelector("a[href='https://www.java.com/']"));
//
//}
    @Test
    public void eBayTest() throws InterruptedException {
        driver.get("https://www.ebay.com/");
        WebElement inputE = driver.findElement(By.id("gh-ac"));
        inputE.sendKeys("Wooden spoon");
        WebElement eButton = driver.findElement(By.id("gh-btn"));
        eButton.click();

        Thread.sleep(3000);
        WebElement results = driver.findElement(By.xpath("//h1"));
        System.out.println(results.getText());
        Thread.sleep(3000);
        WebElement allButton = driver.findElement(By.xpath("//span[text()='All']"));
        Thread.sleep(2000);
        allButton.click();

        WebElement afterAll = driver.findElement(By.xpath("//h1"));
        System.out.println(afterAll.getText());

        Thread.sleep(3000);
        driver.navigate().back();

        WebElement backValue = driver.findElement(By.id("gh-ac"));
        Thread.sleep(2000);
        System.out.println(backValue.getAttribute("value"));

        driver.navigate().back();

        WebElement homePageCheck = driver.findElement(By.id("gh-ac"));
        Thread.sleep(2000);
        System.out.println("Homepage input box value: " + homePageCheck.getAttribute("label"));

    }
        @Test
    public void test() throws InterruptedException {
        //<a href="http://app.vytrack.com">LOGIN</a>
        driver.get("https://vytrack.com/");
        WebElement loginButton = driver.findElement(By.xpath("//a[@href='http://app.vytrack.com']"));
        loginButton.click();

        WebElement useName = driver.findElement(By.id("prependedInput"));
        useName.sendKeys("salesmanager101");

        WebElement passWord = driver.findElement(By.id("prependedInput2"));
        passWord.sendKeys("UserUser123");

        WebElement logButton = driver.findElement(By.id("_submit"));
        logButton.click();

        Thread.sleep(3000);
        WebElement name = driver.findElement(By.xpath("//a[@href='javascript: void(0);']"));
        Thread.sleep(3000);
        name.click();

       Thread.sleep(3000);
        WebElement config = driver.findElement(By.xpath("//a[@href='/config/user/profile']"));
        Thread.sleep(4000);
        config.click();

        String expectedName = name.getText();
        String actualName = driver.getTitle();

        if (actualName.contains(expectedName)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("Expected Name: "+ expectedName + "actual name: " + actualName);
        }






        }




}
