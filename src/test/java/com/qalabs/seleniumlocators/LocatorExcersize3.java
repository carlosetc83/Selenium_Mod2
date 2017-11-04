package com.qalabs.seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LocatorExcersize3 {
    public static void main(String[] arg) {
        //Define Browser to use
        String Browser = "chrome";
        //Get Browser Driver
        WebDriver MyDriver = WebDriverFactory.getDriver(Browser);
        //Open URL
        MyDriver.get("http://www.nasa.gov");
        //Get Link Missions
        WebElement missionLink = MyDriver.findElement(By.linkText("Missions"));
        //Print the href
        System.out.println(missionLink.getAttribute("href"));
        //Get Link Nasa
        WebElement nasaLink = MyDriver.findElement(By.linkText("NASA TV"));
        //Print the href
        System.out.println(nasaLink.getAttribute("href"));
        //Get Link Mars
        WebElement marsLink = MyDriver.findElement(By.partialLinkText("Mars"));
        //Print the href
        System.out.println(marsLink.getAttribute("href"));
        //Get tag names
        List<WebElement> nombreTag = MyDriver.findElements(By.tagName("input"));

        //Print the href for the list
        for (WebElement element: nombreTag) {
            System.out.println(element.getAttribute("href"));
        }

    }
}