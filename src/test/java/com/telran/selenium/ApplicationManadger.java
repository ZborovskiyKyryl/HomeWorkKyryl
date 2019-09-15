package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ApplicationManadger {

    WebDriver driver;

    public void type(By locator) {
        click(locator);
        driver.findElement(By.name("wpName")).clear();
        driver.findElement(By.name("wpName")).sendKeys("chachacha");
    }

    public void click(By locator)
    {
        driver.findElement(locator).click();
    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }
}
