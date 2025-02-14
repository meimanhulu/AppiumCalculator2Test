package com.calculator2.appium;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class CalculatorTest {
  AndroidDriver driver;
  UiAutomator2Options options;

  @BeforeTest
  public void setup() throws InterruptedException, IOException {
    options = new UiAutomator2Options();
    options.setCapability("platformName", "Android");
    options.setCapability("appium:deviceName", "RR8T90084BR");
    options.setCapability("appium:automationName", "UiAutomator2");
    options.setCapability("appium:appPackage", "com.sec.android.app.popupcalculator");
    options.setCapability("appium:appActivity", "com.sec.android.app.popupcalculator.Calculator");

    driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.hideKeyboard();
  }

  @Test
    public void penjumlahanTest() {
        //delay(5);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement buttonClear = wait.until(
                ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("com.google.android.calculator:id/clr"))
        );//clear
        buttonClear.click();

        WebElement buttonNine = wait.until(
                ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("com.google.android.calculator:id/digit_9"))
        );
        
        buttonNine.click();

        WebElement buttonPlus = wait.until(
                ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("com.google.android.calculator:id/op_add"))
        ); //Plus
        buttonPlus.click();

        WebElement buttonFive = wait.until(
                ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("com.google.android.calculator:id/digit_5"))
        ); 
        buttonFive.click();

        WebElement buttonEqual = wait.until(
                ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("com.google.android.calculator:id/eq"))
        ); 
        buttonEqual.click();

        WebElement textEdit = wait.until(
                ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("com.google.android.calculator:id/result_final"))
        ); 

        Assert.assertEquals(textEdit.getText(), "14");
    }

    @AfterTest
    public void tearDone() {
        driver.quit();
    }

    public static void delay(long second){
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}