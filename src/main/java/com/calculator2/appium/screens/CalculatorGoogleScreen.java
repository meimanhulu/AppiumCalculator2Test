package com.calculator2.appium.screens;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.calculator2.appium.drivers.utils.TimeDuration;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;


public class CalculatorGoogleScreen {
  private AndroidDriver driver;
  private WebDriverWait wait;

  private By buttonClear = AppiumBy.accessibilityId("kosongkan");
  private By buttonNine = AppiumBy.accessibilityId("9");
  private By buttonPlus = AppiumBy.accessibilityId("tambah");
  private By buttonFive = AppiumBy.accessibilityId("5");
  private By buttonEqual = AppiumBy.accessibilityId("sama dengan");
  private By textEdit = AppiumBy.id("com.google.android.calculator:id/result_final");

  public CalculatorGoogleScreen(AndroidDriver driver) {
    this.driver = driver;
    wait = new WebDriverWait(this.driver, Duration.ofSeconds(TimeDuration.TWO));
    this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TimeDuration.FIVE));
  }

  public void clickClear() {
    WebElement element = wait.until(
      ExpectedConditions.visibilityOfElementLocated(buttonClear)
    );

    element.click();
  }

  public void clickFive() {
    WebElement element = wait.until(
      ExpectedConditions.visibilityOfElementLocated(buttonFive)
    );

    element.click();
  }

  public void clickPlus() {
    WebElement element = wait.until(
      ExpectedConditions.visibilityOfElementLocated(buttonPlus)
    );

    element.click();
  }

  public void clickNine() {
    WebElement element = wait.until(
      ExpectedConditions.visibilityOfElementLocated(buttonNine)
    );

    element.click();
  }

  public void clickEqual() {
    WebElement element = wait.until(
      ExpectedConditions.visibilityOfElementLocated(buttonEqual)
    );

    element.click();
  }

  public String getResult() {
    WebElement element = wait.until(
      ExpectedConditions.visibilityOfElementLocated(textEdit)
    );

    return element.getText();
  }
}
