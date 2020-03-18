package com.cybertek.tests.day09_testIntro;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FirstTestNGTest {



    @Test //<-- this make it run w/o main method
    public void test1(){
        System.out.println("test one");
    }
 //   @Ignore
    @Test
    public void test2(){
        System.out.println("test two");
    }

    @Test
    public void test3(){
        System.out.println("test three");
    }










}
