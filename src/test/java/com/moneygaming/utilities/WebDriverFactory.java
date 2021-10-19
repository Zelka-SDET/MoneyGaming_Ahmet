package com.moneygaming.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    // Task:
    // Write a static method that takes a string parameter name : browsertype
    // based on value of parameter
    // it will setup the browser and
    // the method will return chromedriver or firefoxdriver
    // name of the method: getDriver

    public static WebDriver getDriver(String browserType) {

        WebDriver driver = null;
        //chrome Chrome CHROME
       switch (browserType.toLowerCase()) {
           case "chrome":
               WebDriverManager.chromedriver().setup();
               driver = new ChromeDriver();

               break;

           case "firefox" :

               WebDriverManager.firefoxdriver().setup();
               driver = new FirefoxDriver();
               break;

       }

        return driver;
    }


}
