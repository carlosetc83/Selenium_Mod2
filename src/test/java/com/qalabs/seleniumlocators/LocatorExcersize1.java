package com.qalabs.seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorExcersize1 {
    public static void main (String [] arg){
    //Define Browser to use
        String Browser = "chrome";
    //Get Browser Driver
        WebDriver MyDriver = WebDriverFactory.getDriver(Browser);
     //Open URL
        MyDriver.get("http://www.mercadolibre.com.mx");
     //Get Search Box
        WebElement searchBox = MyDriver.findElement(By.name("as_word"));
     //Search for Selenium TEXT
        searchBox.sendKeys("Selenium");
     //Get Search Buttom
        WebElement searchButtom = MyDriver.findElement(By.className("nav-search-btn"));
     //Click Search
        searchButtom.click();
     //Find Fist Product
        WebElement firstProduct = MyDriver.findElement(By.className("main-title"));
     //Click on Frist Item
        firstProduct.click();
     //Close Browser
        MyDriver.close();

    }

}
