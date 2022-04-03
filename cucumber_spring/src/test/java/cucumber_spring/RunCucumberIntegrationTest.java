package cucumber_spring;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
	plugin = {
		"pretty",
		"html:target/cucumber/cucumber_spring"
	},
	tags = "",
	features = "src/test/resources/features",
	glue = "cucumber_spring.steps"
)
public class RunCucumberIntegrationTest {}
