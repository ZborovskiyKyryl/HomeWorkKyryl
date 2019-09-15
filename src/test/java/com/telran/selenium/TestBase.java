package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    protected static ApplicationManadger app = new ApplicationManadger();



    @BeforeMethod
    public void setUp(){

        app.driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown(){

        app.driver.quit();
    }


}
