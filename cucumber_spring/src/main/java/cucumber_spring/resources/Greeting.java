package cucumber_spring.resources;

public class Greeting {
	
	private String greetingStr;

	public Greeting() {
		this.greetingStr = "Welcome!";
	}

	public String getGreetingString() {
		return greetingStr;
	}

}
