package com.comcast.watchable;

import org.testng.Assert;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = "json:target/cucumber-report.json")

public class CucumberRunnerTest extends AbstractTestNGCucumberTests


{
	@Test
	public void testApp() {
		Assert.assertTrue(true);
	}
}






	