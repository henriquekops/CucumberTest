package hellocucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
	plugin = {
		"pretty",
		"html:target/cucumber/hellocucumber"
	},
	tags = "",
	features = "src/test/resources/features",
	glue = "hellocucumber.steps"
)
public class RunCucumberIntegrationTest {}
