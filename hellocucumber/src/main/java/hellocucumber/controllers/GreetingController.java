package hellocucumber.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import hellocucumber.resources.Greeting;

@RestController
public class GreetingController {

	@GetMapping("/")
	@ResponseStatus(HttpStatus.OK)
	public Greeting greeting() {
		return new Greeting();
	}

}
