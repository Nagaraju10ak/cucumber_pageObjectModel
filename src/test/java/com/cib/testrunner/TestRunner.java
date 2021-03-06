package com.cib.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "FeatureFiles/MyTestCases/TC001_GmailSignUp.feature",
		glue= {"com.cib.stepdefinitions"},
		plugin = { "pretty", "html:target/cucumber-reports.html" },
	//	tags= "@Leaf",
		monochrome = true
	)
public class TestRunner {

}