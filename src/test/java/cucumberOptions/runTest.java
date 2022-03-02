package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/java/features",
		glue= "stepDefinations", 
		tags="@SmokeTest",
		monochrome = true,plugin = {"html:target/cucumber-html-report", "json:target/cucumber-json-report.json" })	
public class runTest {

}
