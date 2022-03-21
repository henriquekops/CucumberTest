package hellocucumber;

import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("hellocucumber")
@ConfigurationParameter(
	key = PLUGIN_PROPERTY_NAME, 
	value = "pretty"
)
@ConfigurationParameter(
	key = PLUGIN_PROPERTY_NAME,
	value = "html:target/cucumber/hellocucumber"
)
@ConfigurationParameter(
   key = GLUE_PROPERTY_NAME,
   value = "hellocucumber.commons"
)
@ConfigurationParameter(
   key = GLUE_PROPERTY_NAME,
   value = "hellocucumber"
)
public class RunCucumberIntegrationTest {}
