package com.cybertek.tests.day03_locators;

import com.github.javafaker.Faker;

public class FakerPractice {

    public static void main(String[] args) {
        //Create Faker Object

        Faker fakerData = new Faker();

        //I need firstName

        String name = fakerData.name().firstName();

        System.out.println(name);
    }
}
