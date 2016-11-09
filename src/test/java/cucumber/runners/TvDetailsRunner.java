package cucumber.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features",
		glue = "cucumber/stepdefinitions",
		format = "html:target")
public class TvDetailsRunner {
}
