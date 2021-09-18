package TestRunnerDeOneoOne;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/resources/Features" }, plugin = {
		"json:target/cucumber.json" }, glue = "SteppDen")

//tags= {""})

public class TestRunnerDOne extends AbstractTestNGCucumberTests {

}
