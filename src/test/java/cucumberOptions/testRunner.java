package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= "src/test/java/features",

		glue= "stepDefinations", 
		tags="@SmokeTest",
		//format= {"pretty","html:test-output_1","json:target/cucumber-reports/CucumberTestReport.json"},
		plugin = ("json:target/cucumber-reports/CucumberTestReport.json"),
		monochrome= true,
		dryRun= false
		
)
	
public class testRunner {

}
