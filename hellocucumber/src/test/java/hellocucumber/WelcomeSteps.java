package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

import hellocucumber.commons.HttpClient;
import hellocucumber.resources.Greeting;

public class WelcomeSteps {

	@Autowired
	private HttpClient httpClient;
	private String endpoint;

    @Given("the user triggers {string} route")
	public void the_user_triggers_route(String string) {
		this.endpoint = string;
	}

	@Then("the server status code should be {string}")
    public void the_server_status_code_should_be(String string) {
		assertEquals(string, this.httpClient.getStatusCode(this.endpoint));
    }

	@Then("the server should say {string}")
	public void the_server_should_say(String string) {
		assertEquals(string, this.httpClient.getPayload(Greeting.class, this.endpoint));
	}
}
