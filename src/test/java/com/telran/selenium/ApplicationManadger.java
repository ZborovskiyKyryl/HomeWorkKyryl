package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManadger   {
    WebDriver driver;
    LoginHelper loginHelper;
    SessionHelper sessionHelper;


    public void init(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        sessionHelper = new SessionHelper(driver);
        loginHelper = new LoginHelper(driver);

    }



    public LoginHelper getLoginHelper(){
        return loginHelper;
    }

    public SessionHelper getSessionHelper(){
        return sessionHelper;
    }


}
