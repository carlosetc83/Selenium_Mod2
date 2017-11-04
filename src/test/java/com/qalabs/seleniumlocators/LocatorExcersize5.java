package com.qalabs.seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class LocatorExcersize5 {
    public static void main(String[] arg) {
        //Define Browser to use
        String Browser = "chrome";
        //Get Browser Driver
        WebDriver MyDriver = WebDriverFactory.getDriver(Browser);
        //Set implicit Wait
        MyDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Open URL
        MyDriver.get("http://www.amazon.com");
        //Search for Dropdown
        WebElement dropDown = MyDriver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(dropDown);

        System.out.println("Available Options: " + select.getOptions());
        System.out.println("Mutiple Options :" + select.isMultiple());
        System.out.println("First Selected Option :" + select.getFirstSelectedOption().getText());

        select.selectByIndex(0);

        select.selectByValue("search-alias=automotive");
    }
}
