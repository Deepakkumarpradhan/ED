package com.easyDiner.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)				
@CucumberOptions(features="resources/features",glue={"com.easyDiner.stepDefinitions"},
plugin = { "pretty", "pretty:target/cucumber-report/Regresssion/pretty.txt",
		"html:target/cucumber-report/Regresssion", "json:target/cucumber-report/Regresssion/cucumber.json",
		"junit:target/cucumber-report/Regresssion/cucumber-junitreport.xml",
		"ru.yandex.qatools.allure.cucumberjvm.AllureReporter",
		"com.cucumber.listener.ExtentCucumberFormatter:" })
public class testRunner {

}
