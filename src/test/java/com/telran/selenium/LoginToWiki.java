package com.telran.selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginToWiki extends TestBase {

    @Test
    public void loginToWiki() {
        driver.get("https://en.wikipedia.org");

        click(By.id("pt-login"));
        type(By.name("wpName"));

        type(By.name("wpPassword"), "111");

        click(By.name("wpRemember"));
        click(By.name("wploginattempt"));



    }

}
