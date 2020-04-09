package com.cybertek.tests.day10_WebElement;

import org.testng.annotations.Test;

public class OrderOfTest {
    String title;

    @Test(priority = 0)
    public void login(){
        System.out.println("Opening the browser");
        System.out.println("Capture title");
        title = "cbt";
    }

    @Test (priority = 1)
    public void assertTitle(){
        System.out.println("Verifying the title");
        System.out.println();
    }
    @Test(priority = 55)
    public void Verifying(){
        System.out.println("Verify something else");
    }
}
