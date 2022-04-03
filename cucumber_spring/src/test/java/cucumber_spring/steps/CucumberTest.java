package cucumber_spring.steps;

import org.springframework.boot.test.context.SpringBootTest;

import cucumber_spring.Main;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@SpringBootTest(
	classes = Main.class,
	webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
public class CucumberTest {
	
}
