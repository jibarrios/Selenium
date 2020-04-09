package com.cybertek.tests.day18_html_report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExtentReportExample {

    ExtentReports report;
    //^ It used to set up a new report  and build the reports
    ExtentHtmlReporter htmlReporter;
    //^ Used to create the html report

    ExtentTest test;
    //^Used to define a test in report, do logging, mark test result

    @BeforeMethod
    public void setUp(){
        // initialize the report
        report = new ExtentReports();

        // i need to point to the location where report will be create
        // System.getProperty("user.dir") --> gets my current folder
        // + "test-output/report.html" --> create folder test-output and in it create file report.html
        String path = System.getProperty("user.dir")+"/test-output/report.html";
        // initialize the html reporter with the given path
        htmlReporter = new ExtentHtmlReporter(path);
        // set name for the report
        htmlReporter.config().setReportName("Vytrack Automated Tests");

        //attach the html reporter to the report object
        report.attachReporter(htmlReporter);

        // set environment information
        report.setSystemInfo("Environment", "QA");
        report.setSystemInfo("Browser", "Chrome");


    }
    @Test
    public void test(){
        //We have to create a test for every test case
    test = report.createTest("VYT-123 Title verification test");
    test.info("Opening browser");// Notes inserted into the html file
    //driver - new Chromedriver
        test.info("Going to website");
        //driver.get(https:google.com/);
        test.info("Verifying title");
        //AssertEquals(google,google)
        test.pass("VYT-123 Title verification test");


    }
    @AfterMethod
    public void tearDown(){
        //The report will be created when we call this line
        //If we don't call flush method it will not be generated.
        //We do this at the end of everything
        report.flush();
    }
}
