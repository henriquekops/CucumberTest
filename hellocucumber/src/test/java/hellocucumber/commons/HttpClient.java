package hellocucumber.commons;

import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class HttpClient {

	private WebClient client;
	private final String URL = "http://localhost:8080";
	
	public HttpClient() {
		this.client = WebClient.builder()
			.baseUrl(this.URL)
			.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
			.build();
	}

	public Object getPayload(Object object, String endpoint) {
		return this.client
			.get()
			.uri(endpoint)
			.retrieve()
			.bodyToMono(object.getClass())
			.block();
	}

	public String getStatusCode(String endpoint) {
		return this.client
			.get()
			.uri(endpoint)
			.retrieve()
			.toBodilessEntity()
			.block()
			.getStatusCode()
			.toString();
	}

}
