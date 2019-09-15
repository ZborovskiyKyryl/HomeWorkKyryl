package com.telran.selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginToWiki extends TestBase {

    @Test
    public void loginToWiki() {
        app.driver.get("https://en.wikipedia.org");

        app.click(By.id("pt-login"));
        app.type(By.name("wpName"));

        app.type(By.name("wpPassword"), "111");

        app.click(By.name("wpRemember"));
        app.click(By.name("wploginattempt"));



    }

}
