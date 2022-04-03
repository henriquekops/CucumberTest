package hellocucumber.steps;

import org.springframework.boot.test.context.SpringBootTest;

import hellocucumber.Main;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@SpringBootTest(
	classes = Main.class,
	webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
public class CucumberTest {
	
}
