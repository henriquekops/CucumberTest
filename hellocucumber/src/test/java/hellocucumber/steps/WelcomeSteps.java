package hellocucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.reactive.server.WebTestClient;


public class WelcomeSteps extends CucumberTest {

	@Autowired
	WebTestClient client;
	private String endpoint;

	@Given("the user triggers {string} route")
	public void the_user_triggers_route(String string) {
		this.endpoint = string;
	}

	@Then("the server status code should be {string}")
	public void the_server_status_code_should_be(String string) {
		this.client
			.get()
			.uri(this.endpoint)
			.exchange()
			.expectStatus()
			.equals(string);
	}

	@Then("the server should say {string}")
	public void the_server_should_say(String string) {
		this.client
			.get()
			.uri(this.endpoint)
			.exchange()
			.expectBody()
			.json(String.format("{\"greetingString\":\"%s\"}", string));
	}
}
