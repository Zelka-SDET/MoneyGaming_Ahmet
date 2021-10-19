package com.moneygaming.tests;

import com.moneygaming.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.annotation.concurrent.ThreadSafe;

public class Test1 {

/*
1. Navigate to: https://moneygaming.qa.gameaccount.com/sign-up.shtml
2. Enter your first name and surname in the form
3. Verify the text of Checkbox with text 'I accept the Terms and Conditions and certif
y that I am over the age of 18.'
4. Check and verify if it is selected
4. Submit the form by clicking the JOIN NOW button
5. Validate that a validation message with text ‘ This field is required’ appears unde
r the date of
birth box
 */
//  We make our driver object GLOBAL
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        //opens me chrome driver
        driver = WebDriverFactory.getDriver("chrome");
        //maximaze window
        driver.manage().window().maximize();
        //1. Navigate to: https://moneygaming.qa.gameaccount.com/sign-up.shtml
        driver.get("https://moneygaming.qa.gameaccount.com/sign-up.shtml");

    }


    @Test
    public void test1() throws InterruptedException {

        WebElement nameBox = driver.findElement(By.id("forename"));
        nameBox.sendKeys("Mike");

        WebElement surnameBox = driver.findElement(By.xpath("//input[@name='map(lastName)']"));
        surnameBox.sendKeys("Smith");
        Thread.sleep(2000);



    }

    @AfterMethod
    public void tearDown(){
        driver.close();

    }

}
