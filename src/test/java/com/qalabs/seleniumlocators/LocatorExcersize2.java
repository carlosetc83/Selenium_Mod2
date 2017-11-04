package com.qalabs.seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LocatorExcersize2 {
    public static void main(String[] arg) {
        //Define Browser to use
        String Browser = "chrome";
        //Get Browser Driver
        WebDriver MyDriver = WebDriverFactory.getDriver(Browser);
        //Set implicit Wait
        MyDriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        //Open URL
        MyDriver.get("http://www.mercadolibre.com.mx");
        //Get Search Box
        WebElement searchBox = MyDriver.findElement(By.name("prueba"));
        //Close Browser
        MyDriver.close();

    }
}
