package com.calculator2.appium.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/test/resources/features/Calculator.feature",
        },
        glue = {
                "com.calculator2.appium.hooks",
                "com.calculator2.appium.steps",
        },
        plugin = {
                "pretty",
                "html:target/cucumber-reporting-mobile/reporting.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        }
)
public class RunnerTest extends AbstractTestNGCucumberTests {

}