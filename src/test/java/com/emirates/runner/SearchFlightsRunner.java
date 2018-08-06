package com.emirates.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "D:/selenium workspace for eclipse/Emirates/src/test/java/com.emirates.features/SearchFlights.feature" , glue = {
		"classpath:com.emirates.stepdefinition"}, plugin = {"html:target/cucumber-html-report"},dryRun = true)
public class SearchFlightsRunner extends AbstractTestNGCucumberTests {

}
