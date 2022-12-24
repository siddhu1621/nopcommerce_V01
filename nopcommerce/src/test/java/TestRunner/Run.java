package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = ".//Feature/",
		glue = "StepDefination",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:target/cucumber.reports.html"}
		
		)
public class Run {

}
