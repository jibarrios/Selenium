package com.cybertek.tests.day09_testIntro;

import org.openqa.selenium.json.JsonOutput;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionTest {


    @Test
    public void test1(){
        String excepted = "one";
        String actual = "one";

        Assert.assertEquals(actual,excepted);
        Assert.assertEquals(1,1);
        Assert.assertEquals(true,true);

        System.out.println("Test 1 complete");

    }

    @Test
    public void test2(){
        String excepted = "one";
        String actual = "two ";

        System.out.println("Staring to compare");

        Assert.assertEquals(actual,excepted);

        System.out.println("Test 2 complete");

    }
        @Test
    public void test3(){
        String expected = "one";
        String actual = "two";

        Assert.assertNotEquals(expected,actual);
        Assert.assertNotEquals(1,2);
        Assert.assertNotEquals(true,false);
        }

        @Test
    public void test4() {
            String expected = "one";
            String actual = "not one";

            Assert.assertTrue(expected.equals(actual));


            int e = 100;
            int a = 200;
            Assert.assertTrue(a > e);
        }

            @Test
            public void test5(){


                String expected = "https://www.google.com/";
                String actual = "https://www.google.com/";

                Assert.assertEquals(expected,actual);

                String expected1 = "java";
                String actual2 = "java - Google Search";

                Assert.assertTrue(actual2.contains(expected1));








            }










}
