package com.cybertek.tests.day16_page_object_model;

import com.cybertek.Utilities.ConfigurationReader;
import com.cybertek.base.TestBase;
import com.cybertek.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class NegativeLoginTests extends TestBase {

    @Test
    public void wrongUsernameTest(){
        driver.get(ConfigurationReader.getProperty("vytrack_url"));

        LoginPage loginPage = new LoginPage();

        loginPage.username.sendKeys("username300h0");
        loginPage.password.sendKeys("UserUser123");
        loginPage.logIn.click();

        String actual = loginPage.errorMessage.getText();

        Assert.assertEquals(actual, "Invalid user name or password.");
        Assert.assertTrue(loginPage.errorMessage.isDisplayed());

    }
    @Test
    public void wrongPasswordTest(){
        driver.get(ConfigurationReader.getProperty("vytrack_url"));

        LoginPage loginPage = new LoginPage();

        loginPage.username.sendKeys("SalesManager110");
        loginPage.password.sendKeys("LC");
        loginPage.logIn.click();

        String actual = loginPage.errorMessage.getText();

        Assert.assertEquals(actual, "Invalid user name or password.");
        Assert.assertTrue(loginPage.errorMessage.isDisplayed());
    }


}