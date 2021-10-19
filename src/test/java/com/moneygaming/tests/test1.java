package com.moneygaming.tests;

import com.moneygaming.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test1 {

    @BeforeMethod
    public void setUp(){
        //opens me chrome driver
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //maximaze window
        driver.manage().window().maximize();

    }


    @Test
    public void test1(){


    }

    @AfterMethod
    public void tearDown(){

    }

}
